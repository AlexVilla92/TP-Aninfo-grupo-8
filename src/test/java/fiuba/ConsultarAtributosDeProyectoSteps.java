package fiuba;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import fiuba.excepciones.HorasInvalidasException;

public class ConsultarAtributosDeProyectoSteps {

    static final String FECHA_INICIAL = "12/10/18";
    static final String FECHA_FINAL = "12/11/18";
    static final Integer HORAS_PROYECTO = 6;
    static final String NOMBRE_PROYECTO1 = "Projecto1";
    static final String NOMBRE_PROYECTO2 = "Projecto2";
    static final String NOMBRE_PROYECTO3 = "Projecto3";
    static final String NOMBRE_DEV1 = "pablo";
    static final String NOMBRE_DEV2 = "alex";
    static final String ROL_DEV = "DEVELOPER";
    static final String ESTADO_REVISION = "REVISION";

    private Proyecto proyecto1;
    private Proyecto proyecto2;
    private Proyecto proyecto3;
    private RegistroDeHoras registroDeHoras = new RegistroDeHoras();
    private Recurso desarrolladorPablo = new Desarrollador(NOMBRE_DEV1, ROL_DEV, 12000.00);
    private Recurso desarrolladorAlex = new Desarrollador(NOMBRE_DEV2, ROL_DEV, 13000.00);
    private LiderProyecto lider = new LiderProyecto("Daniel", "pl", 30000.00);

    private Boolean excepcionLanzada;

    @Dado("^un proyecto con id (\\d+), el cual cuenta con (\\d+) tareas de (\\d+) hs de duracion estimadas\\. cada una$")
    public void un_proyecto_con_id_el_cual_cuenta_con_tareas_de_hs_de_duracion_estimadas_cada_una(Integer idProyecto,
                                                                                                  Integer cantTareas,
                                                                                                  Integer duracionTareas) throws Throwable {
        this.proyecto1 = new Proyecto(NOMBRE_PROYECTO1, FECHA_INICIAL, FECHA_FINAL, HORAS_PROYECTO);

        for (Integer i = 1; i <= cantTareas; i++) {
            Tarea tarea = new Tarea(FECHA_INICIAL, FECHA_FINAL, duracionTareas);
            this.proyecto1.agregarTarea(tarea);
        }

        this.registroDeHoras.agregarRegistroProyecto(this.proyecto1, this.desarrolladorPablo);
    }

    @Cuando("^el recurso \"(.*?)\" realiza las tareas con id (\\d+), (\\d+) y (\\d+) en (\\d+) hs cada una$")
    public void el_recurso_realiza_las_tareas_con_id_y_en_hs_cada_una(String nombreDev, Integer id1, Integer id2,
                                                                      Integer id3, Integer duracionReal) throws Throwable {
        List<Integer> idsTareas = Arrays.asList(id1, id2, id3);

        for (Integer idTarea: idsTareas) {
            this.registroDeHoras.recursoRealizaTarea(nombreDev, idTarea, duracionReal);
        }
    }

    @Entonces("^el estado del proyecto con id (\\d+), es cambiado a \"(.*?)\" por el lider de proyecto$")
    public void el_estado_del_proyecto_con_id_es_cambiado_a_por_el_lider_de_proyecto(Integer idProyecto, String estado) throws Throwable {
        Proyecto proyecto = this.registroDeHoras.buscarProyecto(idProyecto);

        lider.cambiarEstadoProyecto(proyecto);
        Assert.assertTrue(ESTADO_REVISION.equals(proyecto.getEstado()));
    }

    @Dado("^que se crea un proyecto con (\\d+) tareas de (\\d+) horas cada una$")
    public void que_se_crea_un_proyecto_con_tareas_de_horas_cada_una(Integer cantTareas, Integer duracionTarea) throws Throwable {
        this.proyecto2 = new Proyecto(NOMBRE_PROYECTO2, FECHA_INICIAL, FECHA_FINAL, HORAS_PROYECTO);

        for (Integer i = 1; i <= cantTareas; i++) {
            Tarea tarea = new Tarea(FECHA_INICIAL, FECHA_FINAL, duracionTarea);
            this.proyecto2.agregarTarea(tarea);
        }

        this.registroDeHoras.agregarRegistroProyecto(this.proyecto2, this.desarrolladorAlex);
    }

    @Cuando("^el recurso \"(.*?)\" realiza las tareas con id (\\d+) y (\\d+), en (\\d+) hora cada uno$")
    public void el_recurso_realiza_las_tareas_con_id_y_en_hora_cada_uno(String nombreDev2, Integer id4,
                                                                        Integer id5, Integer horasReales) throws Throwable {
        List<Integer> idsTareas = Arrays.asList(id4, id5);

        for (Integer idTarea: idsTareas) {
            this.registroDeHoras.recursoRealizaTarea(nombreDev2, idTarea, horasReales);
        }
    }

    @Entonces("^el tiempo consumido por el proyecto con id (\\d+) es de (\\d+) hs y el tiempo estimado restante es de (\\d+) hs$")
    public void el_tiempo_consumido_por_el_proyecto_con_id_es_de_hs_y_el_tiempo_estimado_restante_es_de_hs(Integer idProyecto,
                                                                                                           Integer tiempoConsumido,
                                                                                                           Integer tiempoRestante) throws Throwable {
        Integer horasTrabajadas = this.registroDeHoras.horasTrabajadasParaProyecto(idProyecto);//2
        Integer horasEstimadas = this.proyecto2.getHorasEstimadas();//6
        Integer diferencia = horasEstimadas - horasTrabajadas;//4

        Assert.assertEquals(horasTrabajadas, tiempoConsumido);
        Assert.assertEquals(diferencia, tiempoRestante);
    }

    @Dado("^que se crea un proyecto, aun sin tareas$")
    public void que_se_crea_un_proyecto_aun_sin_tareas() throws Throwable {
        this.proyecto3 = new Proyecto(NOMBRE_PROYECTO3, FECHA_INICIAL, FECHA_FINAL);
    }

    @Cuando("^se quiere setear el tiempo estimado del proyecto en meses, con un valor de \"(.*?)\"$")
    public void se_quiere_setear_el_tiempo_estimado_del_proyecto_en_meses_con_un_valor_de(String valorInvalido) throws Throwable {
        try {
            this.proyecto3.setMesesEstimados(Integer.parseInt(valorInvalido));
        } catch (HorasInvalidasException hie) {
            this.excepcionLanzada = Boolean.TRUE;
        }
    }

    @Entonces("^el atributo de tiempo estimado del proyecto sigue teniendo el valor por default, es decir (\\d+)$")
    public void el_atributo_de_tiempo_estimado_del_proyecto_sigue_teniendo_el_valor_por_default_es_decir(Integer valorDefault) throws Throwable {
        Assert.assertTrue(this.proyecto3.getMesesEstimados() == valorDefault);
        Assert.assertTrue(this.excepcionLanzada);
    }

}
