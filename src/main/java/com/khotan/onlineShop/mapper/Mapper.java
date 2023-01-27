package com.khotan.onlineShop.mapper;

import com.khotan.onlineShop.bizcrud.CategoryElementCRUD;
import com.khotan.onlineShop.code.Code;
import com.khotan.onlineShop.model.CategoryElement;
import com.khotan.onlineShop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valueobjects.KeyValueDTO;
import valueobjects.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Mapper implements IMapper {
    @Autowired
    private CategoryElementCRUD categoryElementCRUD;

    @Override
    public UserDTO prepareAddNewUserDTO() {
        UserDTO userDTO = new UserDTO();
        List<CategoryElement> possibleValues = categoryElementCRUD.getCategoryPossibleValues(Code.USER_TYPE);
        List<KeyValueDTO> dtos = possibleValues.stream().map(categoryElement -> new KeyValueDTO(categoryElement.getCode(), categoryElement.getValue())).collect(Collectors.toList());
        userDTO.setCustomerTypes(dtos);
        return userDTO;
    }

    @Override
    public User getUserForCreate(UserDTO userDTO) {
        User user = new User();
        user.setAge(userDTO.getAge());
        user.setCustomerNumber(userDTO.getCustomerNumber());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEnable(Boolean.TRUE);
        user.setActive(Boolean.TRUE);
        return user;
    }


}
