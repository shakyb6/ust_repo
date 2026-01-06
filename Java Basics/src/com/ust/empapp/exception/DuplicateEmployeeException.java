package com.ust.empapp.exception;

public class DuplicateEmployeeException extends RuntimeException{
    public DuplicateEmployeeException(String message) {
        super(message);
    }
}
