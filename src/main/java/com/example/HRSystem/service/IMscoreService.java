package com.example.HRSystem.service;


import com.example.HRSystem.entity.Merits;
import com.example.HRSystem.entity.Mscore;

import java.util.List;

public interface IMscoreService {
    void createdMscore(String username, Mscore mscore);
    List<Mscore> findMscoreList(String username);
}
