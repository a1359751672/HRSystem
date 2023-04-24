package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Notice;
import com.example.HRSystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
    Integer insertNotice(Notice notice);
    User getNameByUid(Integer uid);
}
