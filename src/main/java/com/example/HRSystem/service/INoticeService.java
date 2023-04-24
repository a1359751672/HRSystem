package com.example.HRSystem.service;

import com.example.HRSystem.entity.Merits;
import org.springframework.stereotype.Service;

import java.util.List;


public interface INoticeService {
    void createdMerits(String username, Merits merits);
    List<Merits> findMeritsList(String username);
}
