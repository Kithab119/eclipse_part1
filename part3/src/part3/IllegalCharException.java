package part3;

public class IllegalCharException extends RuntimeException {

	public static final long serialVersionUID = 1L;
	
	public IllegalCharException(String msg) {
		super(msg);
	}
	
	public IllegalCharException() {}

}
