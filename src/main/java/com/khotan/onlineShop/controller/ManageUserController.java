package com.khotan.onlineShop.controller;

import com.khotan.onlineShop.bizcheck.IUserBizCheck;
import com.khotan.onlineShop.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import valueobjects.UserDTO;

@Controller
public class ManageUserController {
    @Autowired
    private UserManager userManager;

    @Autowired
    private IUserBizCheck userBizCheck;


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
        ModelAndView view= userBizCheck.validateUserForRegister(userDTO);
        return view;
    }

}
