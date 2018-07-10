package fiuba;

import java.util.List;

public class LiderProyecto extends Recurso{

    public LiderProyecto(String nombre, String rol, Double sueldo) {
        super(nombre, rol, sueldo);
    }

    public void cambiarEstadoProyecto(Proyecto proyecto) {
        if (this.tareasCompletadas(proyecto)) proyecto.setEstado(Estado.REVISION);
    }

    private Boolean tareasCompletadas(Proyecto proyecto) {
        List<Tarea> tareas = proyecto.getTareas();

        for (Tarea tarea: tareas) {
            if (!Estado.TERMINADO.name().equals(tarea.getEstado())) return false;
        }

        return true;
    }
}
