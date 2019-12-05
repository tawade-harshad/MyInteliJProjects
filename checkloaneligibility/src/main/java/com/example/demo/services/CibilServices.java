package com.example.demo.services;

import com.example.demo.entity.CibilScore;
import com.example.demo.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CibilServices {

    @Autowired
    private MyRepository repo;

    public CibilScore findScoreByPanCard(String panCardNumber){
        return this.repo.findCibilScoreByPanCardNumber(panCardNumber);
    }

    public CibilScore addCibilRecord(CibilScore cibilScore){
        return this.repo.save(cibilScore);
    }
}
