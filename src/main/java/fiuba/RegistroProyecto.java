package fiuba;

public class RegistroProyecto {
    private Integer tareaId;
    private Integer proyectoId;
    private String recursoNombre;
    private Integer horasTrabajadas;

    public RegistroProyecto(Integer idProyecto, Integer idTarea, String nombre) {
        this.tareaId = idTarea;
        this.proyectoId = idProyecto;
        this.recursoNombre = nombre;
        this.horasTrabajadas = 0;
    }
    public Integer getTareaId() {
        return tareaId;
    }

    public void setTareaId(Integer tareaId) {
        this.tareaId = tareaId;
    }

    public Integer getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(Integer proyectoId) {
        this.proyectoId = proyectoId;
    }

    public String getRecursoNombre() {
        return recursoNombre;
    }

    public void setRecursoNombre(String recursoNombre) {
        this.recursoNombre = recursoNombre;
    }
}
