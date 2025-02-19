package soccervs.statics.core.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(NotFoundedException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFoundException(NotFoundedException ex) {
        return ex.getMessage();
    }
	
	@ExceptionHandler(NotPersistedException.class)
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public String handleNotPersistedException(NotPersistedException ex) {
        return ex.getMessage();
    }
}
