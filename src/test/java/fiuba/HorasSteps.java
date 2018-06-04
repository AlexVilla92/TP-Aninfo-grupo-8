package fiuba;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import fiuba.excepciones.HorasInvalidasException;
import org.junit.Assert;

public class HorasSteps {

    private SistemaPsa sistemaPsa;
    private Desarrollador desarrollador;
    private final static Integer HORAS_TRABAJADAS = 8;
    private final static String LEGAJO = "AAA1233";
    private final static String UN_ROL = "Develop";

    @Dado("^que el desarrollador tiene una cantidad de horas cargadas de \"(.*?)\"$")
    public void que_el_desarrollador_tiene_una_cantidad_de_horas_cargadas_de(String arg1) throws Throwable {
        sistemaPsa = new SistemaPsa();
        desarrollador = new Desarrollador(LEGAJO, UN_ROL);
        sistemaPsa.cargarUsuario(desarrollador.getNroLegajo());
    }

    @Cuando("^carga \"(.*?)\" horas en el sistema$")
    public void carga_horas_en_el_sistema(String arg1) throws Throwable {
        if (HORAS_TRABAJADAS <= 0) throw new HorasInvalidasException("La cantidad de horas a cargar es invalida");
        sistemaPsa.usuarioCargaHoras(desarrollador.getNroLegajo(), HORAS_TRABAJADAS);
    }

    @Entonces("^la cantidad total de horas trabajadas para ese desarrollador son \"(.*?)\" horas$")
    public void la_cantidad_total_de_horas_trabajadas_para_ese_desarrollador_son_horas(String arg1) throws Throwable {
        Assert.assertEquals(HORAS_TRABAJADAS, sistemaPsa.getHorasTrabajadasParaEmpleado(desarrollador.getNroLegajo()));
    }
}
