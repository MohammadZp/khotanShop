package com.khotan.onlineShop.utility;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import valueobjects.UserDTO;
import java.util.List;

@Service
public interface IUtility {
    ModelAndView getModelAndView(String webPageUrl);

    ModelAndView getModelAndView(String webPageUrl, Object obj, String objectName);

    ModelAndView getSuccessfulOperationModelAndView(String message, String targetUrl);

    ModelAndView getUserSearchResultList(List<UserDTO> dtos);

}
