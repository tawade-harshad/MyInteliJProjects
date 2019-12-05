package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo repo;

    @GetMapping(value = "/employee")
    public Iterable<Employee> findAll(){
        return this.repo.findAll();
    }
}

