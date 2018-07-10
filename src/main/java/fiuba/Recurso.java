package fiuba;

public class Recurso {
    protected static Integer legajoUniversal = 0;
    protected Integer legajo;
    protected String nombre;
    protected String rol;
    protected Double sueldo;

    public Recurso(String nombre, String rol, Double sueldo) {
        this.iniciarLegajo();
        this.nombre = nombre;
        this.rol = rol;
        this.sueldo = sueldo;
    }

    public Recurso() {
        this.iniciarLegajo();
    }

    private void iniciarLegajo() {
        incLegajo();
        this.legajo = legajoUniversal;
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
