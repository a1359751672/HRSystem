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

    }

    @Test
    void getByName() {
        User admin = mapper.getByName("123456");
        System.out.println(admin);
    }

    @Test
    void testGetByName() {
        User admin = mapper.getByName("123456");
        System.out.println(admin);
    }
}