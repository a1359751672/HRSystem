package com.example.HRSystem.service.Impl;

import com.example.HRSystem.entity.Mscore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IMscoreServiceImplTest {
    @Autowired
    IMscoreServiceImpl service;

    @Test
    void createdMscore() {
        Mscore mscore = new Mscore();
        service.createdMscore("123456",mscore);
    }
}