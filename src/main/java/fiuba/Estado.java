package fiuba;

public abstract class Estado {//transformarlo en enum

    protected String estado;

    public Estado() {
        this.estado = "inicial";
    }

    public abstract void avanzar();

    protected String getEstado() {
        return this.estado;
    }

    protected void setEstado(String estado) {
        this.estado = estado;
    }
}
