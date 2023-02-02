package com.khotan.onlineShop.exception;

public class BizCheckException extends Exception{

    private String errorMessage;

    public BizCheckException(String errorMessage) {
        this.errorMessage=errorMessage;

    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
