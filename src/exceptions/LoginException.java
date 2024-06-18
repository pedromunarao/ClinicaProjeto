package exceptions;

public class LoginException extends RuntimeException{
	
	public LoginException() {
		super("Falha ao realizar login!");
	}
	
	public LoginException(String message) {
		super(message);
	}

}
