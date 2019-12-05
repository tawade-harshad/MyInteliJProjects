package com.example.demo.controllers;

import com.example.demo.entity.CibilScore;
import com.example.demo.services.CibilServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
public class CibilController {

    @Autowired
    private CibilServices services;

    @GetMapping(value = "/cibilScore/{panNumber}")
    public CibilScore findCibilScore(@PathVariable("panNumber") String panCardNumber){
        return this.services.findScoreByPanCard(panCardNumber);
    }

    @PostMapping(value = "/cibilScore", produces = "application/json", consumes = "application/json")
    public CibilScore addCibilRecord(@RequestBody CibilScore cibilScore){
        return this.services.addCibilRecord(cibilScore);
    }
}
