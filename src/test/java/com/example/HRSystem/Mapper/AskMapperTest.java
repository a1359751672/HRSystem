package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Ask;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AskMapperTest {
    @Autowired(required = false)
     AskMapper mapper;

    @Test
    void countByUserId() {
        Integer count =mapper.countByUserId(250);
        System.out.println("该用户共有"+count+"请假信息");
    }

   @Test
    void saveAsk() {
    Ask ask=new Ask();
        Integer row = mapper.saveAsk(ask);
        System.out.println("row"+row);
    }

    @Test
    void getAskByUserId() {
        List<Ask> list =mapper.getAskByUserId(250);
        list.forEach(System.out::println);
    }
}