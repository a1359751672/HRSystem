package com.example.HRSystem.service.Impl;

import com.example.HRSystem.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserServiceImpl service;

    @Test
    void changeUserInfo() {
        User user = new User();
        user.setName("龙");
        user.setNation("汉族");
        user.setCard(BigInteger.valueOf(1234651032));
        user.setEducation("高中");
        Integer row = service.changeUserInfo("123456", user);
        System.out.println(row);
    }

    @Test
    void testChangeUserInfo() {
        User user = new User();
        user.setName("龙");
        user.setNation("汉族");
        user.setAge(17);
        user.setCard(BigInteger.valueOf(1234651032));
        user.setEducation("高中");
        Integer row = service.changeUserInfo("123456", user);
        System.out.println(row);
    }

    @Test
    void modifyPassword() {
        Integer row = service.modifyPassword("123456","12","123");
        System.out.println(row);
    }
}