package com.khotan.onlineShop.mapper;

import com.khotan.onlineShop.model.User;
import org.springframework.stereotype.Service;
import valueobjects.UserDTO;
@Service
public interface IMapper {
    UserDTO prepareAddNewUserDTO();

    User getUserForCreate(UserDTO userDTO);

    UserDTO getUserDTO(User user);
}
