package com.example.HRSystem.service;

import com.example.HRSystem.entity.Merits;

import java.util.List;

public interface IMeritsService {
    void createdMerits(String username, Merits merits);
    List<Merits> findMeritsList(String username);

}
