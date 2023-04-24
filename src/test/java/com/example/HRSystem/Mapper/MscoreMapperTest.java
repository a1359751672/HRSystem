package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Mscore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MscoreMapperTest {
    @Autowired
    MscoreMapper mapper;

    @Test
    void
    insertMscore() {
        Mscore mscore = new Mscore();
        mscore.setMid(35);
        mscore.setScore(60);
        mscore.setEvaluate("合格");
        Integer row = mapper.insertMscore(mscore);
        System.out.println(row);
    }


    @Test
    void getByMid() {
        List<Mscore> ms = mapper.getByMid(1);
        System.out.println(ms);
    }
}