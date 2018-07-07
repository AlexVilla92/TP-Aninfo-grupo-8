package fiuba;

import java.util.Arrays;
import java.util.List;
import javax.swing.*;

import org.junit.Assert;
import org.junit.Test;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import fiuba.excepciones.HorasInvalidasException;

public class ConsultarAtributosDeProyectoSteps {

    static final String INICIAL = "inicial";
    static final String PROGRESS = "en progreso";
    static final String NOMBRE_TAREA = "TAREA";
    static final String FECHA_INICIAL = "12/10/18";
    static final String FECHA_FINAL = "12/11/18";
    static final Integer HORAS_PROYECTO1 = 1;
    static final String NOMBRE_PROYECTO1 = "Projecto1";
    static final String NOMBRE_DEV1 = "pablo";
    static final String ROL_DEV = "DEVELOPER";

    private Proyecto proyecto1;
    private Proyecto proyecto2;
    private RegistroDeHoras registroDeHoras = new RegistroDeHoras();
    private Recurso recursoPablo = new Recurso(NOMBRE_DEV1, ROL_DEV, 12000.00);

    private Boolean excepcionLanzada;
    /*
    Escenario: Se consulta el estado de un proyecto que se encuentra suspendido
    Dado un proyecto con 3 tareas
    Cuando el recurso "pablo" realiza las 3 tareas
    Entonces el estado del proyecto cambia a "revision"
     */

    @Dado("^un proyecto con (\\d+) tareas$")
    public void un_proyecto_con_tareas(Integer cantTareas) throws Throwable {
        this.proyecto1 = new Proyecto(NOMBRE_PROYECTO1, FECHA_INICIAL, FECHA_FINAL, HORAS_PROYECTO1);
        this.excepcionLanzada = Boolean.FALSE;

        for (Integer i = 1; i <= cantTareas; i++) {
            Tarea tarea = new Tarea(FECHA_INICIAL, FECHA_FINAL);
            this.proyecto1.agregarTarea(tarea);
        }

        this.registroDeHoras.agregarRegistroProyecto(this.proyecto1, this.recursoPablo);
    }

    @Cuando("^el recurso \"(.*?)\" realiza las tareas con id (\\d+), (\\d+) y (\\d+)$")
    public void el_recurso_realiza_las_tareas_con_id_y(String nombreDev, Integer id1, Integer id2, Integer id3) throws Throwable {
        List<Integer> idsTareas = Arrays.asList(id1, id2, id3);

        for (Integer idTarea: idsTareas) {
            this.registroDeHoras.recursoRealizaTarea(nombreDev, idTarea);
        }
    }

    @Entonces("^el estado del proyecto es cambiado a \"(.*?)\" por el pl$")
    public void el_estado_del_proyecto_es_cambiado_a_por_el_pl(String arg1) throws Throwable {
        Assert.assertTrue(this.excepcionLanzada);
    }

    @Dado("^que se crea un proyecto con (\\d+) tareas de (\\d+) horas cada una$")
    public void que_se_crea_un_proyecto_con_tareas_de_horas_cada_una(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Cuando("^el recurso \"(.*?)\" realiza dos tareas en (\\d+) hora cada uno$")
    public void el_recurso_realiza_dos_tareas_en_hora_cada_uno(String arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Entonces("^el tiempo consumido del proyecto es (\\d+) y el tiempo restante es (\\d+)$")
    public void el_tiempo_consumido_del_proyecto_es_y_el_tiempo_restante_es(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete action
    }

    @Dado("^que se crea un proyecto$")
    public void que_se_crea_un_proyecto() throws Throwable {
        // Write code here that turns the phrase above into concrete action
    }

    @Cuando("^se quiere setear las horas con \"(.*?)\", se lanza una excepcion$")
    public void se_quiere_setear_las_horas_con_se_lanza_una_excepcion(String arg1) throws Throwable {
        // Write code here that turns the phrase above into conc
    }

    @Entonces("^los atributos siguen siendo por default$")
    public void los_atributos_siguen_siendo_por_default() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
