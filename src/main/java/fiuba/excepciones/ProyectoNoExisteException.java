package fiuba.excepciones;

public class ProyectoNoExisteException extends RuntimeException {
    public ProyectoNoExisteException(String message) {
        super(message);
    }
}
