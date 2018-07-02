package fiuba;

public class Backlog extends Estado {

    public Backlog() {
        super();
    }
    @Override public void avanzar() {
        this.setEstado("in progress");
    }
}
