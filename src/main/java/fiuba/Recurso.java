package fiuba;

import org.omg.CORBA.INTERNAL;

public class Recurso {
    private static Integer legajoUniversal = 0;
    private Integer legajo;
    private String nombre;
    private String rol;
    private Double sueldo;

    public Recurso(String nombreDev1, String rolDev, Double sueldo) {
        incLegajo();
        this.legajo = legajoUniversal;
        this.nombre = nombreDev1;
        this.rol = rolDev;
        this.sueldo = sueldo;
    }

    public static void incLegajo() {
        legajoUniversal++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
}
