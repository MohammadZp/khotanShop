package com.khotan.onlineShop.bizcheck;

import com.khotan.onlineShop.exception.BizCheckException;
import org.springframework.stereotype.Service;
import valueobjects.UserDTO;
@Service
public interface IUserBizCheck {

    void validateUserForRegister(UserDTO userDTO) throws BizCheckException;
}
