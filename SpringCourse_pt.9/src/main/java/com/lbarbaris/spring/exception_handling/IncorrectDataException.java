package com.lbarbaris.spring.exception_handling;

public class IncorrectDataException extends RuntimeException{
    public IncorrectDataException(String message) {
        super(message);
    }
}
