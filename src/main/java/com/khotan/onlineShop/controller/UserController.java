package com.khotan.onlineShop.controller;

import com.khotan.onlineShop.manager.UserManager;
import com.khotan.onlineShop.message.Message;
import com.khotan.onlineShop.service.IService;
import com.khotan.onlineShop.utility.IUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import valueobjects.UserDTO;

@Controller
public class UserController {
    @Autowired
    private UserManager userManager;

    @Autowired
    private IService service;

    @Autowired
    private IUtility utility;


    @GetMapping("/manageUser")
    public ModelAndView loadManageUserPage() {
        return userManager.prepareManageUserDTO();
    }

    @GetMapping("/addNewUser")
    public ModelAndView loadAddNewUserPage() {
        return userManager.prepareAddNewUserDTO();
    }


    @PostMapping("/saveUser")
    public ModelAndView create(@ModelAttribute UserDTO userDTO) throws Exception {
        service.createUser(userDTO);
        return utility.getSuccessfulOperationModelAndView(Message.SAVED_USER_SUCCESSFULLY,"/manageUser");
    }

}
