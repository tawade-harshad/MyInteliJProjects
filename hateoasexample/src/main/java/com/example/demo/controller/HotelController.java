package com.example.demo.controller;

import com.example.demo.entity.Hotel;
import com.example.demo.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelrepo;

    @GetMapping(value = "/hotel/{id}", produces = "application/hal+json")
    public Hotel findHotelById(@PathVariable("id") int hotelId){
        return this.hotelrepo.findById(hotelId).get();
    }
    @GetMapping(value = "/hotel",produces = "application/hal+json")
    public Resources<Hotel> findAll(){

        List<Hotel> hotelList = this.hotelrepo.findAll();

       List<Link> links = new ArrayList<>();
        for (Hotel eachHotel: hotelList ) {
              Link hotelLink = linkTo(methodOn(HotelController.class).findHotelById(eachHotel.getHotelId())).withSelfRel();
              links.add(hotelLink);
        }

        Resources<Hotel> resource = new Resources<>(hotelList,links);
        return resource;
    }
}
