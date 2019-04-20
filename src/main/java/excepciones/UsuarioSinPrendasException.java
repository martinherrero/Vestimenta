package excepciones;

@SuppressWarnings("serial")

public class UsuarioSinPrendasException extends Exception {

	public UsuarioSinPrendasException() {
		super("No posee prendas para evaluar la mejor combinación");
	}

}