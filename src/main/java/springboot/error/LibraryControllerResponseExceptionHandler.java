package springboot.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@ResponseStatus
public class LibraryControllerResponseExceptionHandler {
  @ExceptionHandler(BookNotFoundException.class)
  public ResponseEntity<ErrorMessage> getBookNotFoundException(BookNotFoundException bnfe, WebRequest request) {
    var message = new ErrorMessage(HttpStatus.NOT_FOUND, bnfe.getMessage());

    return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(message);
  }
}

