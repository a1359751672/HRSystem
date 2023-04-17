package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper mapper;


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

    @Test
    void getByAdmin() {
        List<User> ad = mapper.getByAdmin();
        System.out.println(ad);
    }

    @Test
    void updataUserInfo() {
        User user = new User();
//        user.setUsername("123456");
        user.setName("小龙");
        user.setNation("汉族");
        user.setCard(1234651032);
        user.setEducation("本科");
        Integer row = mapper.updataUserInfo(user);
        System.out.println(row);
    }
}