package fiuba;

import java.util.ArrayList;
import java.util.List;

import fiuba.excepciones.ProyectoNoExisteException;

public class RegistroDeHoras {
    private List<RegistroProyecto> registroProyectos = new ArrayList<RegistroProyecto>();

    public void agregarRegistroProyecto(RegistroProyecto registroProyecto) {
        this.registroProyectos.add(registroProyecto);
    }

    public void agregarRegistroProyecto(Proyecto proyecto, Recurso developer) {
        List<Tarea> tareasProyecto = proyecto.getTareas();
        RegistroProyecto registroProyecto;

        for (Tarea tarea: tareasProyecto) {
            if (developer != null) {
                registroProyecto = new RegistroProyecto(proyecto, tarea, developer.getNombre());
                tarea.avanzarEstado();
            } else {
                registroProyecto = new RegistroProyecto(proyecto, tarea);
            }

            this.registroProyectos.add(registroProyecto);
        }

        this.avanzarEstadoProyectoEnProgreso(proyecto);
    }

    private void avanzarEstadoProyectoEnProgreso(Proyecto proyecto) {
        List<Tarea> tareasProyecto = proyecto.getTareas();

        for (Tarea tarea: tareasProyecto) {
            if (!Estado.PROGRESO.name().equals(tarea.getEstado())) return;
        }

        proyecto.setEstado(Estado.PROGRESO);
    }

    public void recursoRealizaTarea(String nombreDev, Integer idTarea, Integer duracionReal) {
        RegistroProyecto registroProyecto = null;

        for (RegistroProyecto registro: this.registroProyectos) {
            if (nombreDev.equals(registro.getRecursoNombre()) && idTarea.equals(registro.getTarea().getIdTarea())) {
                registro.setHorasTrabajadas(duracionReal);
                registro.getTarea().setEstado(Estado.TERMINADO);
                return;
            }
        }
    }

    public Proyecto buscarProyecto(Integer idProyecto) {
        for (RegistroProyecto registro: this.registroProyectos) {
            if (idProyecto.equals(registro.getProyecto().getIdProyecto())) return registro.getProyecto();
        }

        throw new ProyectoNoExisteException("el proyecto con el id " + idProyecto + " no existe");
    }

    public Integer horasTrabajadasParaProyecto(Integer idProyecto) {
        Integer cantHoras = 0;

        for (RegistroProyecto registroProyecto: this.registroProyectos) {
            if (idProyecto.equals(registroProyecto.getProyecto().getIdProyecto())) cantHoras += registroProyecto.getHorasTrabajadas();
        }

        return cantHoras;
    }
}
