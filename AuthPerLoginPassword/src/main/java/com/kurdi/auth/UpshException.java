package com.kurdi.auth;


public class UpshException extends Exception {
    private final String message;

    public UpshException(String s) {
        this.message = s;
    }


}
