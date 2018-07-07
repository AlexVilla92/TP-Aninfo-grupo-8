package fiuba;

import java.util.ArrayList;
import java.util.List;

import fiuba.excepciones.HorasInvalidasException;

public class Proyecto {
    private static Integer idUniversal = 0;
    private Integer idProyecto;
    private String nombre;
    private String fechaInicial;
    private String fechaFinal;
    private Integer mesesEstimados;
    private Estado estado;
    private List<Tarea> tareas;

    public Proyecto(String nombre, String fechaInicial, String fechaFinal, Integer mesesEstimados) {
        Proyecto.incIdProyecto();
        this.idProyecto = idUniversal;
        this.nombre = nombre;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.estado = new Backlog();
        this.mesesEstimados = mesesEstimados;
        this.iniciarTareas();
    }

    public static void incIdProyecto() {
        idUniversal++;
    }

    private void iniciarTareas() {
        this.tareas = new ArrayList<>();
    }

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.fechaInicial = "";
        this.fechaFinal = "";
        this.estado = new Backlog();
        this.iniciarTareas();
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

    public String getEstado() {
        return this.estado.getEstado();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void avanzarEstado() {
        this.estado.avanzar();
    }

    public Integer getMesesEstimados() {
        return mesesEstimados;
    }

    public void setMesesEstimados(Integer mesesEstimados) {
        if (mesesEstimados <= 0) throw new HorasInvalidasException("el tiempo ingresado es incorrecto");
        this.mesesEstimados = mesesEstimados;
    }


    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }
}
