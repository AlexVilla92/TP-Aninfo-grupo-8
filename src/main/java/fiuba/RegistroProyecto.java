package fiuba;

public class RegistroProyecto {
    private Tarea tarea;
    private Proyecto proyecto;
    private String recursoNombre;
    private Integer horasTrabajadas;

    public RegistroProyecto(Proyecto proyecto, Tarea tarea, String nombre) {
        this.tarea = tarea;
        this.proyecto = proyecto;
        this.recursoNombre = nombre;
        this.horasTrabajadas = 0;
    }

    public RegistroProyecto(Proyecto proyecto, Tarea tarea) {
        this.tarea = tarea;
        this.proyecto = proyecto;
        this.recursoNombre = "";
        this.horasTrabajadas = 0;
    }

    public String getRecursoNombre() {
        return recursoNombre;
    }

    public void setRecursoNombre(String recursoNombre) {
        this.recursoNombre = recursoNombre;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
