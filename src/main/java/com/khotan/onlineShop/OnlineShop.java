package com.khotan.onlineShop;

import com.khotan.onlineShop.bizcrud.CategoryElementCRUD;
import com.khotan.onlineShop.bizcrud.UserCRUD;
import com.khotan.onlineShop.code.Code;
import com.khotan.onlineShop.message.Message;
import com.khotan.onlineShop.model.Category;
import com.khotan.onlineShop.model.CategoryElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OnlineShop {


    public static void main(String[] args) {
        boolean createCategories = true;

        SpringApplication.run(OnlineShop.class, args);
       // ApplicationContext context = new AnnotationConfigApplicationContext(UserCRUD.class);

//        if (createCategories) {
//            CategoryElementCRUD crud = context.getBean(CategoryElementCRUD.class);
//            List<CategoryElement> list = new ArrayList<>();
//
//            //user
//            Category category = new Category(Code.USER_TYPE);
//            list.add(new CategoryElement(Code.CUSTOMER_USER, Message.CUSTOMER_USER, category));
//
//
//            list.forEach(elementCRUD -> crud.save(elementCRUD));
//
//
//        }
    }

}
