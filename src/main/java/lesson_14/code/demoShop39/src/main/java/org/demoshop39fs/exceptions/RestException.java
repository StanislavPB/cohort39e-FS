package lesson_14.code.demoShop39.src.main.java.org.demoshop39fs.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class RestException extends RuntimeException{
    private final HttpStatus status;

    public RestException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}
