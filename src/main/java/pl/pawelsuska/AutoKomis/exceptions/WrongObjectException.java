package pl.pawelsuska.AutoKomis.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongObjectException extends RuntimeException {

    public WrongObjectException(String message) {
        super(message);
    }
}
