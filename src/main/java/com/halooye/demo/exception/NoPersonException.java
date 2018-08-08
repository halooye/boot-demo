package com.halooye.demo.exception;

public class NoPersonException extends Exception {
    private static final long serialVersionUID = -5955607821816077172L;

    public NoPersonException(String errorInfo) {
        super(errorInfo);
    }
}
