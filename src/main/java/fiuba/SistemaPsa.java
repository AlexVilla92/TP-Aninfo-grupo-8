package fiuba;

import fiuba.excepciones.UsuarioNoExisteException;
import fiuba.excepciones.UsuarioYaCargadoException;

import java.util.HashMap;
import java.util.Map;

public class SistemaPsa {

    private Map<String, Integer> horasEmpleados;
    private final static Integer HORAS_INICIALES = 0;

    public SistemaPsa() {
        this.horasEmpleados = new HashMap<String, Integer>();
    }

    public Map<String, Integer> getHorasEmpleados() {
        return horasEmpleados;
    }

    public void setHorasEmpleados(Map<String, Integer> horasEmpleados) {
        this.horasEmpleados = horasEmpleados;
    }

    public void cargarUsuario(String nroLegajo) {
        if (this.horasEmpleados.containsKey(nroLegajo)) throw new UsuarioYaCargadoException("El usuario ya fue cargado");
        this.horasEmpleados.put(nroLegajo, HORAS_INICIALES);
    }

    public void usuarioCargaHoras(String nroLegajo, Integer horasTrabajadas) {
        if (!this.horasEmpleados.containsKey(nroLegajo)) throw new UsuarioNoExisteException("El usuario no existe en el sistema");
        this.horasEmpleados.put(nroLegajo, this.horasEmpleados.get(nroLegajo) + horasTrabajadas);
    }

    public Integer getHorasTrabajadasParaEmpleado(String nroLegajo) {
        if (!this.horasEmpleados.containsKey(nroLegajo)) throw new UsuarioNoExisteException("El usuario no existe en el sistema");
        return this.horasEmpleados.get(nroLegajo);
    }
}
