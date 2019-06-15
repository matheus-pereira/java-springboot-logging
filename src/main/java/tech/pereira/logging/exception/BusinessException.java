package tech.pereira.logging.exception;

public abstract class BusinessException extends Exception {

	private static final long serialVersionUID = 2202905662584906233L;
	
	public BusinessException(String message) {
		super(message);
	}
}
