package com.khotan.onlineShop.bizcheck;

import com.google.common.base.Strings;
import com.khotan.onlineShop.bizcrud.UserCRUD;
import com.khotan.onlineShop.exception.BizCheckException;
import com.khotan.onlineShop.message.Message;
import com.khotan.onlineShop.utility.IUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import valueobjects.UserDTO;

import java.util.Objects;

@Service
public class UserBizCheck implements IUserBizCheck {
    @Autowired
    private IUtility utility;
    @Autowired
    private UserCRUD userCRUD;

    @Override
    public void validateUserForRegister(UserDTO userDTO) throws BizCheckException {
        checkIfInputsAreNull(userDTO);
        checkIfUsernameIsDuplicate(userDTO);
    }

    private void checkIfUsernameIsDuplicate(UserDTO userDTO) throws BizCheckException {
        if (Objects.nonNull(userCRUD.getUserByUsername(userDTO.getUsername()))) {
            throw new BizCheckException(Message.DUPLICATE_USERNAME);
        }

    }

    private static void checkIfInputsAreNull(UserDTO userDTO) throws BizCheckException {
        if (Strings.isNullOrEmpty(userDTO.getFirstName())) {
            throw new BizCheckException(Message.NULL_USER_FIRSTNAME_EXCEPTION);
        }
        if (Strings.isNullOrEmpty(userDTO.getLastName())) {
            throw new BizCheckException(Message.NULL_USER_LASTNAME_EXCEPTION);
        }
        if (Strings.isNullOrEmpty(userDTO.getUsername())) {
            throw new BizCheckException(Message.NULL_USER_USERNAME_EXCEPTION);
        }
        if (Strings.isNullOrEmpty(userDTO.getEmail())) {
            throw new BizCheckException(Message.NULL_USER_EMAIL_EXCEPTION);
        }
        if (Objects.isNull(userDTO.getAge())) {
            throw new BizCheckException(Message.NULL_USER_AGE_EXCEPTION);
        }
        if (Strings.isNullOrEmpty(userDTO.getPassword())) {
            throw new BizCheckException(Message.NULL_USER_PASSWORD_EXCEPTION);
        }
    }

}


