package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper mapper;

    @Test
    void updataPassword() {
        User user = new User();
        user.setId(4);
        user.setPassword("1");
        user.setModifiedTime(new Date());
        user.setModifiedUser("123456");
        Integer row = mapper.updataPassword(user);
        System.out.println(row);
    }


//    @Test
//    void getByName() {
//        User admin = mapper.getByName("123456");
//        System.out.println(admin);
//    }
//
//    @Test
//    void testGetByName() {
//        User admin = mapper.getByName("123456");
//        System.out.println(admin);
//    }
//
//    @Test
//    void getByAdmin() {
//        List<User> ad = mapper.getByAdmin();
//        System.out.println(ad);
//    }
//
//    @Test
//    void updataUserInfo() {
//        User user = new User();
//        user.setUsername("123456");
//        user.setName("小龙");
//        user.setNation("汉族");
//        user.setCard(BigInteger.valueOf(1234651032));
//        user.setEducation("本科");
//        Integer row = mapper.updataUserInfo(user);
//        System.out.println(row);
//    }
//
//    @Test
//    void aupdataUserInfo() {
//        User user = new User();
//        user.setUsername("123456");
//        user.setJnum(1234);
//        user.setDeptId(1);
//        user.setName("小龙");
//        user.setNation("汉族");
//        user.setCard(BigInteger.valueOf(1234651032));
//        user.setEducation("本科");
//        Integer row = mapper.updataUserInfo(user);
//        System.out.println(row);
//    }
}