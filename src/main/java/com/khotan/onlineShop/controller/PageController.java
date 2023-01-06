package com.khotan.onlineShop.controller;

import com.khotan.onlineShop.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @GetMapping("/")
    public String index() {
        return "htmls/index";
    }

    @GetMapping("/error")
    public String error() {
        return "hi!";
    }
}
