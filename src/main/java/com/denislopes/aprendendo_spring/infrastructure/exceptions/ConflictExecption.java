package com.denislopes.aprendendo_spring.infrastructure.exceptions;

public class ConflictExecption extends RuntimeException {
    public ConflictExecption(String message) {
        super(message);
    }

    public ConflictExecption(String message, Throwable throwable) {
        super(message);
    }

}
