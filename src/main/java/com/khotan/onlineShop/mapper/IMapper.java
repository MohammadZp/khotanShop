package com.khotan.onlineShop.mapper;

import org.springframework.stereotype.Service;
import valueobjects.UserDTO;
@Service
public interface IMapper {
    UserDTO prepareAddNewUserDTO();
}
