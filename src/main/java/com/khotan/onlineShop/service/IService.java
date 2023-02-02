package com.khotan.onlineShop.service;

import com.khotan.onlineShop.exception.BizCheckException;
import org.springframework.stereotype.Service;
import valueobjects.UserDTO;
@Service
public interface IService {

    void createUser(UserDTO userDTO) throws BizCheckException;
}
