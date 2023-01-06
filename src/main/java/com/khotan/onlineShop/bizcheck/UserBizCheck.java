package com.khotan.onlineShop.bizcheck;

import com.google.common.base.Strings;
import com.khotan.onlineShop.exception.BizCheckException;
import com.khotan.onlineShop.utility.IUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import valueobjects.UserDTO;

@Service
public class UserBizCheck implements IUserBizCheck {
    @Autowired
    private IUtility utility;

    @Override
    public ModelAndView validateUserForRegister(UserDTO userDTO) {
        try {
            if (Strings.isNullOrEmpty(userDTO.getFirstName())) {
                throw new BizCheckException("خااااک");
            }
            return utility.getModelAndView("htmls/add-user",null, "e");
        } catch (BizCheckException e) {
            return utility.getModelAndView("htmls/add-user","خطا:", "e");
        }
    }
}


