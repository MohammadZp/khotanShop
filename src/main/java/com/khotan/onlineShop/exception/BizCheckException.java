package com.khotan.onlineShop.exception;

public class BizCheckException extends Exception{

    private String message;

    public BizCheckException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
