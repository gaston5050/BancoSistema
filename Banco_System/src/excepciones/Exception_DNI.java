package excepciones;

public class Exception_DNI extends RuntimeException {

	@Override
	public String getMessage() {
	
		return "DNI existente en base de datos.";
	}

	
	
	
	
}
