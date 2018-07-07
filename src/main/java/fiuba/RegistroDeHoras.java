package fiuba;

import java.util.List;

public class RegistroDeHoras {
    private List<RegistroProyecto> registroProyectos;

    public void agregarRegistroProyecto(RegistroProyecto registroProyecto) {
        this.registroProyectos.add(registroProyecto);
    }

    public void agregarRegistroProyecto(Proyecto proyecto, Recurso recursoPablo) {
        List<Tarea> tareasProyecto = proyecto.getTareas();

        for (Tarea tarea: tareasProyecto) {
            RegistroProyecto registroProyecto = new RegistroProyecto(proyecto.getIdProyecto(), tarea.getIdTarea(), recursoPablo.getNombre());
            this.registroProyectos.add(registroProyecto);
        }
    }

    public void recursoRealizaTarea(String nombreDev, Integer idTarea) {
        //busco el objeto que coincida con estos dos parametros y
        //seteo las horas de la tarea como cumplida(iguales)
    }
}
