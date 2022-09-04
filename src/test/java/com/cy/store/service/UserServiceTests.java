package com.cy.store.service;

import com.cy.store.entity.User;
import com.cy.store.service.ex.ServiceExpection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTests {

    @Autowired
    private IUserService iUserService;


    @Test
    public void reg() {
        List<String> nameList = Arrays.asList("tom","kevin","tony","max","chen","wang","tian","song");
        for (String name : nameList) {
            try {
                User user = new User();
                user.setUsername(name);
                user.setPassword("123456");
                iUserService.reg(user);
                System.out.println("ok!!!!!!!!!!!!!!!!!!!!!!!");
            } catch (ServiceExpection e) {
                System.out.println(e.getClass().getSimpleName());
                System.out.println(e.getMessage());
            }
        }
    }

    @Test
    public void login() {
        User user = iUserService.login("Tom", "123456");
        System.out.println(user);
    }

    @Test
    public void updatePassword(){
        int uid = 10;
        String username = "admin";
        String password = "123456";
        iUserService.updatePassword(uid,username,password,password);
    }


    @Test
    public void getUserByUid(){
        System.out.println(iUserService.getByUid(10));
    }
    @Test
    public void updateInfo(){
        User user  = new User();
        user.setUsername("Tom");
        user.setPhone("546461354346");
        user.setEmail("dasdas@163.com");
        user.setGender(0);
        iUserService.updateInfo(user,"admin",10);
    }

}
