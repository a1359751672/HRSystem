package com.example.HRSystem.service;

import com.example.HRSystem.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IUserServiceTest {

    @Test
    void regist() {
        User user = new User();
        user.setId(1);
        user.setUsername("Admin");
        user.setPassword("Admin");
        user.setCreatedUser("Admin");
        System.out.println(user);
    }
}