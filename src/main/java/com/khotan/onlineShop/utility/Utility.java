package com.khotan.onlineShop.utility;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import valueobjects.UserDTO;

import java.util.List;

@Service
public class Utility implements IUtility {
    @Override
    public ModelAndView getModelAndView(String webPageUrl) {
        return new ModelAndView(webPageUrl);
    }

    public  ModelAndView getModelAndView(String webPageUrl, Object obj, String objectName) {
        ModelAndView modelAndView = new ModelAndView(webPageUrl);
        modelAndView.addObject(objectName, obj);
        return modelAndView;
    }

    @Override
    public ModelAndView getSuccessfulOperationModelAndView(String message,String targetUrl) {
        ModelAndView modelAndView = new ModelAndView("htmls/successful-operation");
        modelAndView.addObject("message", message);
        modelAndView.addObject("targetUrl", targetUrl);
        return modelAndView;
    }

    @Override
    public ModelAndView getUserSearchResultList(List<UserDTO> dtos) {
        ModelAndView modelAndView = new ModelAndView("htmls/searchUser-child");
        modelAndView.addObject("userList", dtos);
        return modelAndView;
    }
}
