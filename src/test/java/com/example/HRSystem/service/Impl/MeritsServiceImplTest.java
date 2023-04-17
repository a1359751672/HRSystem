package com.example.HRSystem.service.Impl;

import com.example.HRSystem.Mapper.MeritsMapper;
import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MeritsServiceImplTest {
    @Autowired
    MeritsServiceImpl service;

    @Autowired
    MeritsMapper mapper;

    @Test
    void createdMerits() {
        Merits merits = new Merits(12,null,null,null,10,10,10,new Date(),4,null);
        service.createdMerits("123456789",merits);
    }

    @Test
    void testCreatedMerits() {
    }

    @Test
    void findMeritsList() {
        List<Merits> m = service.findMeritsList("123456789");
        System.out.println(m);
    }
}