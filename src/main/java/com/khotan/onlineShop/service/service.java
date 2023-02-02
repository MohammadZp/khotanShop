package com.khotan.onlineShop.service;

import com.khotan.onlineShop.bizcheck.IUserBizCheck;
import com.khotan.onlineShop.bizcrud.UserCRUD;
import com.khotan.onlineShop.exception.BizCheckException;
import com.khotan.onlineShop.mapper.IMapper;
import com.khotan.onlineShop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valueobjects.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class service implements IService {

    @Autowired
    private IUserBizCheck userBizCheck;

    @Autowired
    private UserCRUD userCRUD;

    @Autowired
    private IMapper mapper;

    @Override
    public void createUser(UserDTO userDTO) throws BizCheckException {
        userBizCheck.validateUserForRegister(userDTO);
        User user = mapper.getUserForCreate(userDTO);
        userCRUD.save(user);
    }

    @Override
    public List<UserDTO> searchItems(UserDTO userDTO) {
        List<User> userList = userCRUD.searchUserByCriteria(userDTO);
        List<UserDTO> userDTOList = userList.stream().map(user -> mapper.getUserDTO(user)).collect(Collectors.toList());
        return userDTOList;
    }
}
