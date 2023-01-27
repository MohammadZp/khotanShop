package com.khotan.onlineShop;

import com.khotan.onlineShop.bizcrud.CategoryCRUD;
import com.khotan.onlineShop.bizcrud.CategoryElementCRUD;
import com.khotan.onlineShop.code.Code;
import com.khotan.onlineShop.message.Message;
import com.khotan.onlineShop.model.Category;
import com.khotan.onlineShop.model.CategoryElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class versionMain implements CommandLineRunner {

//    @Autowired
//    private CategoryElementCRUD categoryElementCRUD;
//
//    @Autowired
//    private CategoryCRUD categoryCRUD;

    @Override
    public void run(String... args) throws Exception {
//        List<CategoryElement> categoryElements = new ArrayList<>();
//        //userTypes
//        categoryElements.add(new CategoryElement(Code.CUSTOMER_USER, Message.CUSTOMER_USER, new Category(Code.USER_TYPE)));
//        categoryElements.add(new CategoryElement(Code.SYSTEM_USER, Message.SYSTEM_USER, new Category(Code.USER_TYPE)));
//
//
//        addCategoryElements(categoryElements);
    }

    private void addCategoryElements(List<CategoryElement> categoryElements) {
//        for (CategoryElement categoryElement : categoryElements
//        ) {
//            if (notExist(categoryElement)) {
////                categoryCRUD.save(categoryElement.getCategory());
//                categoryElementCRUD.save(categoryElement);
//            }
//        }
    }

//    private boolean notExist(CategoryElement categoryElement) {
////        return categoryElementCRUD.findByCategoryCode(categoryElement.getCode(), categoryElement.getCategory().getName()).equals(new Long(0));
//    }
}
