package com.example.HRSystem.service.Impl;

import com.example.HRSystem.entity.Merits;
import com.example.HRSystem.service.INoticeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements INoticeService {
    @Override
    public void createdMerits(String username, Merits merits) {

    }

    @Override
    public List<Merits> findMeritsList(String username) {
        return null;
    }
}
