package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MeritsMapperTest {
    @Autowired
    MeritsMapper mapper;

    @Test
    void insertMerits() {
        Merits m = new Merits();
        m.setId(1);
        m.setName("萨达");
        m.setJnum(123);
        m.setDeptId(1);
        m.setAtt(50);
        m.setManner(20);
        m.setAbi(30);
        System.out.println(m);
    }

    @Test
    void deptByid() {
        String s = mapper.deptByid(1);
        System.out.println(s);
    }

    @Test
    void getByUidAndDid() {
        Merits b = mapper.getByUidAndDid(1, 1);
        System.out.println(b);
    }

    @Test
    void testGetByUidAndDid() {
        Merits a = mapper.getByUidAndDid(1, 1);
        System.out.println(a);
    }
}