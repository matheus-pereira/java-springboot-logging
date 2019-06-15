package tech.pereira.logging.exception;

public class ExistentUserException extends BusinessException {

	private static final long serialVersionUID = 2239730338863325601L;

	public ExistentUserException() {
		super("This user already exists");
	}
}
