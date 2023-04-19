package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
    Integer insertNotice(Notice notice);
    String getNameByUid(Integer uid);
}
