package soccervs.statics.core.resources.exceptions;

public class NotFoundedException extends RuntimeException {
private static final long serialVersionUID = 1L;
	
	public NotFoundedException(String msg) {
		super(msg);
	}
}
