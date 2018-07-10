package fiuba;

public class Tarea {
    private static final String BACKLOG = "backlog";
    private static final String PROGRESS = "progreso";
    private static final String REVISION = "revision";
    private static final String TERMINADO = "terminado";
    private static Integer idGeneral = 0;
    private Integer idTarea;
    private String fechaInicial;
    private String fechaFinal;
    private Integer horasEstimado;
    private Estado estado;
    private String descripcion;

    public Tarea(String fechaInicial, String fechaFinal, Integer duracionTareas) {
        Tarea.incIdCuenta();
        this.idTarea = idGeneral;
        this.fechaFinal = fechaFinal;
        this.fechaInicial = fechaInicial;
        this.horasEstimado = duracionTareas;
        this.estado = Estado.BACKLOG;
    }

    public static void incIdCuenta() {
        idGeneral++;
    }

    public Integer getIdTarea() {
        return this.idTarea;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Integer getHorasEstimado() {
        return horasEstimado;
    }

    public void setHorasEstimado(Integer tiempoEstimado) {
        this.horasEstimado = tiempoEstimado;
    }

    public String getEstado() {
        return this.estado.name();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void avanzarEstado() {
        switch (this.estado.name().toLowerCase()) {
        case BACKLOG : this.setEstado(Estado.PROGRESO);break;
        case PROGRESS: this.setEstado(Estado.REVISION);break;
        case REVISION: this.setEstado(Estado.TERMINADO);break;
        default: return;
        }
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
