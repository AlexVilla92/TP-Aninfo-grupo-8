package fiuba;

import org.junit.Assert;
import org.junit.Test;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import fiuba.excepciones.HorasInvalidasException;

public class ConsultarAtributosDeProyectoSteps {

    static final String INICIAL = "inicial";
    static final String PROGRESS = "in progress";

    private Proyecto proyecto1;
    private Proyecto proyecto2;

    @Dado("^que se crea un proyecto$")
    public void que_se_crea_un_proyecto() throws Throwable {
        this.proyecto1 = new Proyecto("Project 1");
    }

    @Cuando("^se quiere setear las horas con \"(.*?)\", se lanza una excepcion$")
    public void se_quiere_setear_las_horas_con_se_lanza_una_excepcion(String horas) throws Throwable {
        try {
            this.proyecto1.setHorasEstimadas(Integer.parseInt(horas));
        } catch (HorasInvalidasException hie) {
            Assert.assertTrue(true);
        }
    }

    @Entonces("^los atributos siguen siendo por default$")
    public void los_atributos_siguen_siendo_por_default() throws Throwable {
        Assert.assertTrue(this.proyecto1.getHorasEstimadas() == 0);
    }

    @Dado("^que se crea el proyecto con los parametros correctos$")
    public void que_se_crea_el_proyecto_con_los_parametros_correctos() throws Throwable {
        this.proyecto2 = new Proyecto("Project 2", "12/10/18", "12/11/18", 700);
    }

    @Cuando("^se cambia el estado del proyecto  y la fecha final a \"(.*?)\"$")
    public void se_cambia_el_estado_del_proyecto_y_la_fecha_final_a(String fechaFinal) throws Throwable {
        Assert.assertTrue(INICIAL.equals(this.proyecto2.getEstado()));
        this.proyecto2.setFechaFinal(fechaFinal);
        this.proyecto2.avanzarEstado();
    }

    @Entonces("^el valor de dichos atributos cambian$")
    public void el_valor_de_dichos_atributos_cambian() throws Throwable {
        Assert.assertTrue(PROGRESS.equals(this.proyecto2.getEstado()));
        Assert.assertTrue("12/12/18".equals(this.proyecto2.getFechaFinal()));
    }

    @Dado("^el estado de los atributos del proyecto cambian$")
    public void el_estado_de_los_atributos_del_proyecto_cambian() throws Throwable {

    }
}
