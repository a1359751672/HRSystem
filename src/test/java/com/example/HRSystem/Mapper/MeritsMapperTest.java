package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MeritsMapperTest {
    @Autowired
    MeritsMapper mapper;

    @Test
    void insertMerits() {
        Merits m = new Merits();
        m.setId(null);
        m.setUserId(4);
//        m.setName("第一次测试员");
        m.setJnum(123);
        m.setDeptId(1);
        m.setAtt(50);
        m.setManner(20);
        m.setAbi(30);
        Integer row = mapper.insertMerits(m);
        System.out.println(row);
    }

    @Test
    void deptByid() {
       Dept s = mapper.deptByid(1);
        System.out.println(s);
    }

    @Test
    void getByUidAndDid() {
        Merits b = mapper.getByUid(4);
        System.out.println(b);
    }

    @Test
    void updateById() {
        Merits merits = new Merits(12,null,null,null,10,10,10,new Date(),4,null);
        Integer o = mapper.UpdateById(merits);
        System.out.println("更新成功"+o);
    }

    @Test
    void getMeritsByUserId() {
        List<Merits> m = mapper.getMeritsByUserId();
        System.out.println(m);
    }

    @Test
    void getMeritsUserId() {
        List<Merits> m = mapper.getMeritsUserId(4);
        System.out.println(m);
    }
}