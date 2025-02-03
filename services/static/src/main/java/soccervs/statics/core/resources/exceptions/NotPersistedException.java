package soccervs.statics.core.resources.exceptions;

public class NotPersistedException extends RuntimeException {
private static final long serialVersionUID = 1L;
	
	public NotPersistedException(String msg) {
		super(msg);
	}
}
