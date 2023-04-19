package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Notice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NoticeMapperTest {

    @Autowired(required = false)
    NoticeMapper mapper;

    @Test
    void insertNotice() {
        Notice notice = new Notice();
        notice.setTitle("测试公告1");
        notice.setCont("测试公告内容1");
        notice.setUserId(4);
        notice.setCreatedUser("123456");
        Integer row = mapper.insertNotice(notice);
        System.out.println(row);
    }

    @Test
    void getNameByUid() {
        String cname = mapper.getNameByUid(4);
        System.out.println(cname);
    }
}