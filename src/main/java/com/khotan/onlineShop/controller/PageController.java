package com.khotan.onlineShop.controller;

import com.khotan.onlineShop.exception.BizCheckException;
import com.khotan.onlineShop.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @GetMapping("/")
    public String index() {
        return "htmls/index";
    }

    @GetMapping("/errorhandle")
    public String errorFrameLoader() {
        return "htmls/error";
    }
}
