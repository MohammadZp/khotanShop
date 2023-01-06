package com.khotan.onlineShop.controller;

import com.khotan.onlineShop.exception.BizCheckException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {BizCheckException.class})
    public ResponseEntity<Object> handleBizCheckException(BizCheckException exception, WebRequest request) {
        String message = exception.getLocalizedMessage();
        return new ResponseEntity<>(message, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
