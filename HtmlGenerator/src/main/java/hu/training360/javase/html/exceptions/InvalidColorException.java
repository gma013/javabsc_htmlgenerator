package hu.training360.javase.html.exceptions;

public class InvalidColorException extends RuntimeException {
    public InvalidColorException() {
    }

    public InvalidColorException(String message) {
        super(message);
    }
}