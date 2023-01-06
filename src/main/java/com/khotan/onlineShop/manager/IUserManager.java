package com.khotan.onlineShop.manager;

import org.springframework.web.servlet.ModelAndView;

public interface IUserManager {

    ModelAndView prepareManageUserDTO();

    ModelAndView prepareAddNewUserDTO();
}
