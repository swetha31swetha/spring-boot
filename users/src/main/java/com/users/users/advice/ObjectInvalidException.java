package com.users.users.advice;
public class ObjectInvalidException extends RuntimeException {

    public ObjectInvalidException(String message) {
        super(message);
    }

    public ObjectInvalidException() {
    }

}
