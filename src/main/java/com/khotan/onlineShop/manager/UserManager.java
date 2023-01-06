package com.khotan.onlineShop.manager;

import com.khotan.onlineShop.bizcrud.CategoryElementCRUD;
import com.khotan.onlineShop.bizcrud.UserCRUD;
import com.khotan.onlineShop.code.Code;
import com.khotan.onlineShop.mapper.IMapper;
import com.khotan.onlineShop.model.CategoryElement;
import com.khotan.onlineShop.utility.IUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import valueobjects.UserDTO;

import java.util.List;

@Service
public class UserManager implements IUserManager {


    @Autowired
    private UserCRUD userCrud;

    @Autowired
    private IMapper mapper;

    @Autowired
    private CategoryElementCRUD categoryElementCRUD;

    @Autowired
    private IUtility utility;

    public ModelAndView prepareManageUserDTO() {
        return utility.getModelAndView("htmls/manage-user");
    }


    public ModelAndView prepareAddNewUserDTO() {
        UserDTO userDTO = mapper.prepareAddNewUserDTO();
        return utility.getModelAndView("htmls/add-user", userDTO, "userDTO");
    }
}
