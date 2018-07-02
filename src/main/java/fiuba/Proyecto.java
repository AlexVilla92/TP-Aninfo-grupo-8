package fiuba;

import fiuba.excepciones.HorasInvalidasException;

public class Proyecto {
    private String nombre;
    private String fechaInicial;
    private String fechaFinal;
    private Integer horasEstimadas;
    private Estado estado;

    public Proyecto(String nombre, String fechaInicial, String fechaFinal, Integer horas) {
        this.nombre = nombre;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.horasEstimadas = horas;
        this.estado = new Backlog();
    }

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.horasEstimadas = 0;
        this.fechaInicial = "";
        this.fechaFinal = "";
        this.estado = new Backlog();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        if (horasEstimadas <= 0) throw new HorasInvalidasException("las horas ingresadas son incorrectas");
        this.horasEstimadas = horasEstimadas;
    }

    public String getEstado() {
        return this.estado.getEstado();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void avanzarEstado() {
        this.estado.avanzar();
    }
}
