package com.example.demo.service;

import com.example.demo.entity.Catalog;
import com.example.demo.repo.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CatalogRepository repo;

    public List<Catalog> findAllCatalog()
    {
        return this.repo.findAll();

    }

    public Catalog addCatalog(Catalog catalog){
        return this.repo.save(catalog);
    }

    public Catalog updateCatalog(Catalog catalog){
        return this.repo.save(catalog);
    }
}
