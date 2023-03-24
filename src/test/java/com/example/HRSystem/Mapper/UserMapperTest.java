package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper mapper;

    @Test
    void insertUser() {
        User user = new User();
        user.setUsername("Admin");
        user.setPassword("Admin");
        user.setAdmin(true);
        user.setCreatedUser("Admin");
        System.out.println(user);
    }

    @Test
    void getByName() {
        User admin = mapper.getByName("Admin");
        System.out.println(admin);
    }
}