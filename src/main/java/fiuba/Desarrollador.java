package fiuba;

public class Desarrollador {

    private String nroLegajo;
    private String rol;

    public Desarrollador(String nroLegajo, String rol) {
        this.nroLegajo = nroLegajo;
        this.rol = rol;
    }

    public String getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(String nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
