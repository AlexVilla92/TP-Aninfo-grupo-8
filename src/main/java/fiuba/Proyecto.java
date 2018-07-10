package fiuba;

import java.util.ArrayList;
import java.util.List;

import fiuba.excepciones.HorasInvalidasException;
import fiuba.excepciones.RecursoInvalidoException;

public class Proyecto {
    private static Integer idUniversal = 0;
    private Integer idProyecto;
    private String nombre;
    private String fechaInicial;
    private String fechaFinal;
    private Integer mesesEstimados;
    private Estado estado;
    private List<Tarea> tareas;
    private List<Recurso> recursos;

    public Proyecto(String nombre, String fechaInicial, String fechaFinal, Integer mesesEstimados) {
        this.iniciarProyecto(nombre, fechaInicial, fechaFinal, mesesEstimados);
    }

    private void iniciarProyecto(String nombre, String fechaInicial, String fechaFinal, Integer mesesEstimados) {
        Proyecto.incIdProyecto();
        this.idProyecto = idUniversal;
        this.nombre = nombre;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.estado = Estado.BACKLOG;
        this.mesesEstimados = mesesEstimados;
        this.tareas = new ArrayList<>();
        this.recursos = new ArrayList<>();
    }

    public Proyecto(String nombre, String fechaInicial, String fechaFinal) {
        this.iniciarProyecto(nombre, fechaInicial, fechaFinal, 0);
    }

    public static void incIdProyecto() {
        idUniversal++;
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

    public void setEstado(Estado estado) {
        this.estado = estado;
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

    public String getEstado() {
        return this.estado.name();
    }

    public Integer getHorasEstimadas() {
        Integer cantHoras = 0;
        for (Tarea tarea:  this.tareas) cantHoras += tarea.getHorasEstimado();
        return cantHoras;
    }

    public void agregarRecurso(Recurso recurso) {
        if (recurso == null) throw new RecursoInvalidoException("EL recurso que se asigna al proyecto es invalido");
        this.recursos.add(recurso);
    }

    public Integer getSalariosRecursos() {
        Integer sumaSalarios = 0;

        for (Recurso recurso: this.recursos) {
            sumaSalarios += recurso.getSueldo().intValue();
        }

        return sumaSalarios;
    }
}
