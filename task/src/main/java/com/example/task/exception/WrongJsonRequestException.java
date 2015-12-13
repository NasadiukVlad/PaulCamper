package com.example.task.exception;

/**
 * Created by Влад on 12.12.2015.
 */
public class WrongJsonRequestException extends Exception {
    private String reason;

    public WrongJsonRequestException() {
        this.reason = "Bad json request or we can`t offer anything";
    }

    @Override
    public String getMessage() {
        return reason;
    }

    public void setMessage(String reason) {
        this.reason = reason;
    }
}
