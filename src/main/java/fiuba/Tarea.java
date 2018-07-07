package fiuba;

public class Tarea {
    private static Integer idTarea = 0;
    private String fechaInicial;
    private String fechaFinal;
    private Integer horasEstimado;
    private Estado estado;
    private String descripcion;

    public Tarea() {
        Tarea.incIdCuenta();
    }

    public Tarea(String fechaInicial, String fechaFinal) {
        Tarea.incIdCuenta();
        this.fechaFinal = fechaFinal;
        this.fechaInicial = fechaInicial;
    }

    public static void incIdCuenta() {
        idTarea++;
    }

    public Integer getIdTarea() {
        return idTarea;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
