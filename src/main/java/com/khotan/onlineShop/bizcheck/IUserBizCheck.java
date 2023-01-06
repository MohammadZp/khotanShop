package com.khotan.onlineShop.bizcheck;

import com.khotan.onlineShop.exception.BizCheckException;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import valueobjects.UserDTO;
@Service
public interface IUserBizCheck {

    ModelAndView validateUserForRegister(UserDTO userDTO) ;
}
