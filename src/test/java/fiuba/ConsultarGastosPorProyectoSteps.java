package fiuba;

import org.junit.Assert;
import org.omg.CORBA.INTERNAL;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ConsultarGastosPorProyectoSteps {

    static final String FECHA_INICIAL = "12/10/18";
    static final String FECHA_FINAL = "12/11/18";
    static final Integer DURACION_PROYECTO = 6;
    static final String ROL_DEV = "DEVELOPER";
    static final String NOMBRE_PROYECTO1 = "Projecto1";
    static final String NOMBRE_PROYECTO2 = "Projecto2";
    private Proyecto proyecto1;
    private Proyecto proyecto2;
    private Proyecto proyecto3;
    private Recurso dev1;
    private Recurso dev2;
    private Recurso dev3;

    @Dado("^un proyecto de (\\d+) meses de duracion$")
    public void un_proyecto_de_meses_de_duracion(Integer duracionProyecto) throws Throwable {
        this.proyecto1 = new Proyecto(NOMBRE_PROYECTO1, FECHA_INICIAL, FECHA_FINAL, duracionProyecto);
        this.proyecto1.setTiempoTranscurrido(duracionProyecto);
    }

    @Cuando("^a dicho proyecto, se asignan los recursos \"(.*?)\" y \"(.*?)\" con salarios (\\d+) y (\\d+), respectivamente$")
    public void a_dicho_proyecto_se_asignan_los_recursos_y_con_salarios_y_respectivamente(String nombreDev1, String nombreDev2,
                                                                                          Integer salario1, Integer salario2) throws Throwable {
        this.dev1 = new Desarrollador(nombreDev1, ROL_DEV, salario1.doubleValue());
        this.dev2 = new Desarrollador(nombreDev2, ROL_DEV, salario2.doubleValue());
        this.proyecto1.agregarRecurso(dev1);
        this.proyecto1.agregarRecurso(dev2);
    }

    @Entonces("^el costo estimado del proyecto es (\\d+) x \\((\\d+) \\+ (\\d+)\\) = (\\d+)$")
    public void el_costo_del_proyecto_es_x(Integer tiempoProyecto, Integer salario1, Integer salario2, Integer totalProyecto) throws Throwable {
        Integer sumaSalarios = this.proyecto1.getCostoRecursos();
        Integer total = tiempoProyecto * sumaSalarios;

        Assert.assertTrue(this.proyecto1.estaTerminado());
        Assert.assertTrue(sumaSalarios == (salario1 + salario2));
        Assert.assertEquals(total, totalProyecto);
    }

    @Dado("^un proyecto de (\\d+) meses de duracion estimada, el cual lleva (\\d+) meses consumidos$")
    public void un_proyecto_de_meses_de_duracion_estimada_y_mes_consumido(Integer duracionEstimada,
                                                                          Integer tiempoTranscurrido) throws Throwable {
        this.proyecto2 = new Proyecto(NOMBRE_PROYECTO2, FECHA_INICIAL, FECHA_FINAL, duracionEstimada);
        this.proyecto2.setTiempoTranscurrido(tiempoTranscurrido);
    }

    @Cuando("^a dicho proyecto, se asigna el recurso \"(.*?)\" con un salario de (\\d+)$")
    public void a_dicho_proyecto_se_asigna_el_recurso_con_un_salario_de(String nombreDev, Integer salario) throws Throwable {
        this.dev3 = new Desarrollador(nombreDev, ROL_DEV, salario.doubleValue());
        this.proyecto2.agregarRecurso(dev3);
    }

    @Entonces("^el costo del proyecto es de (\\d+) x (\\d+) = (\\d+)$")
    public void el_costo_del_proyecto_es_de_x(Integer mesesConsumidos, Integer salario, Integer costoParcial) throws Throwable {
        Integer sumaSalarios = this.proyecto2.getCostoRecursos();
        Integer totalParcial = mesesConsumidos * sumaSalarios;

        Assert.assertTrue(this.proyecto2.estaEnDesarrollo());
        Assert.assertEquals(sumaSalarios, salario);
        Assert.assertEquals(totalParcial, costoParcial);
    }


    @Dado("^un proyecto de (\\d+) meses de duracion estimada$")
    public void un_proyecto_de_meses_de_duracion_estimada(Integer duracionProyecto) throws Throwable {
        this.proyecto3 = new Proyecto(NOMBRE_PROYECTO2, FECHA_INICIAL, FECHA_FINAL, duracionProyecto);
    }

    @Cuando("^se le asignan (\\d+) recursos al proyecto$")
    public void se_le_asignan_recursos_al_proyecto(int arg1) throws Throwable {

    }

    @Entonces("^el costo del proyecto es (\\d+) x (\\d+) = (\\d+)$")
    public void el_costo_del_proyecto_es_x(Integer tiempoProyecto, Integer salario, Integer totalProyecto) throws Throwable {
        Integer costoSalarios = this.proyecto3.getCostoRecursos();
        Integer total = tiempoProyecto * costoSalarios;

        Assert.assertTrue(this.proyecto3.noEstaIniciado());
        Assert.assertEquals(costoSalarios, salario);
        Assert.assertEquals(total, totalProyecto);
    }

}
