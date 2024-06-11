package com.lbarbaris.spring.springcourse_pt8.exception_handling;

public class IncorrectDataException extends RuntimeException{
    public IncorrectDataException(String message) {
        super(message);
    }
}
