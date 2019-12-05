package com.example.demo.controller;

import com.example.demo.entity.Catalog;
import com.example.demo.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping(value = "/catalog")
    public List<Catalog> findAllCatalog(){
        return this.service.findAllCatalog();
    }

    @PostMapping(value = "/catalog", produces = "application/json", consumes = "application/json")
    public Catalog addCatalog(@RequestBody Catalog catalog){
        return this.service.addCatalog(catalog);
    }

    @PutMapping(value = "/catalog", produces = "application/json", consumes = "application/json")
    public Catalog updateCatalog(@RequestBody Catalog catalog){
        return this.service.updateCatalog(catalog);
    }
}
