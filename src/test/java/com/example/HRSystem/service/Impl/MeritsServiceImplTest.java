package com.example.HRSystem.service.Impl;

import com.example.HRSystem.Mapper.MeritsMapper;
import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MeritsServiceImplTest {
    @Autowired
    MeritsServiceImpl service;

    @Autowired
    MeritsMapper mapper;

    @Test
    void createdMerits() {
        Merits merits = new Merits(null,null,123456,1,6,6,6,new Date(2023,5,1),null,null,null);
        service.createdMerits("123456789",merits);
    }

    @Test
    void testCreatedMerits() {
    }
}