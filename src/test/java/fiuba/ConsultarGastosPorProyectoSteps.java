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
    private Proyecto proyecto1;
    private Recurso dev1;
    private Recurso dev2;

    @Dado("^un proyecto de (\\d+) meses de duracion$")
    public void un_proyecto_de_meses_de_duracion(Integer duracionProyecto) throws Throwable {
        this.proyecto1 = new Proyecto(NOMBRE_PROYECTO1, FECHA_INICIAL, FECHA_FINAL, duracionProyecto);
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
        Integer sumaSalarios = this.proyecto1.getSalariosRecursos();
        Integer total = tiempoProyecto * sumaSalarios;

        Assert.assertTrue(sumaSalarios == (salario1 + salario2));
        Assert.assertEquals(total, totalProyecto);
    }

    @Dado("^un proyecto de (\\d+) meses de duracion estimada, y (\\d+) mes consumido$")
    public void un_proyecto_de_meses_de_duracion_estimada_y_mes_consumido(Integer duracionEstimada,
                                                                          Integer tiempoTranscurrido) throws Throwable {

    }

    @Cuando("^a dicho proyecto, se asigna el recurso \"(.*?)\" con un salario de (\\d+)$")
    public void a_dicho_proyecto_se_asigna_el_recurso_con_un_salario_de(String nombreDev, Integer salario) throws Throwable {

    }

    @Entonces("^el costo del proyecto es (\\d+) x (\\d+) = (\\d+)$")
    public void el_costo_del_proyecto_es_x(int arg1, int arg2, int arg3) throws Throwable {

    }
}
