package com.example.HRSystem.Mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AskMapperTest {
    @Autowired(required = false)
    AskMapper mapper;

    @Test
    void countByUserId() {
        Integer num = mapper.countByUserId(250);
        System.out.println(num);
    }

    @Test
    void saveAsk() {
    }

    @Test
    void getAskByUserId() {
    }
}