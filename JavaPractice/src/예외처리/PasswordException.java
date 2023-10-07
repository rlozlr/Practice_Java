package 예외처리;

public class PasswordException extends IllegalArgumentException {
	
	public PasswordException (String message) {
		super(message);
	}

}
