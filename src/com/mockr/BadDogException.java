package com.mockr;

public class BadDogException extends RuntimeException {

    public BadDogException() {
    }

    public BadDogException(String message) {
        super(message);
    }

    public BadDogException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadDogException(Throwable cause) {
        super(cause);
    }
}
