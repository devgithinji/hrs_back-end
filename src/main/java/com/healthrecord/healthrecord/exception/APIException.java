package com.healthrecord.healthrecord.exception;

public class APIException extends RuntimeException {
    private String message;


    public APIException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
