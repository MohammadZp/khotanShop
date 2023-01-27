package com.khotan.onlineShop;

import com.khotan.onlineShop.bizcrud.CategoryElementCRUD;
import com.khotan.onlineShop.bizcrud.UserCRUD;
import com.khotan.onlineShop.code.Code;
import com.khotan.onlineShop.message.Message;
import com.khotan.onlineShop.model.Category;
import com.khotan.onlineShop.model.CategoryElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class OnlineShop {


    public static void main(String[] args) {
        SpringApplication.run(OnlineShop.class, args);
    }

}
