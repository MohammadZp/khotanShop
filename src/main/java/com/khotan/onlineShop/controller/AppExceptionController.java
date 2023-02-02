package com.khotan.onlineShop.controller;

import com.khotan.onlineShop.exception.BizCheckException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BizCheckException.class)
    public ModelAndView handleException(BizCheckException ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("htmls/error");
        modelAndView.addObject("errorMessage", ex.getErrorMessage());
        return modelAndView;
    }
}
