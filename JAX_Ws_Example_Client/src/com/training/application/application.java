package com.training.application;

import com.training.example.MovieService;
import com.training.example.MovieServiceImplService;

public class application {

    public static void main(String[] args) {
        MovieServiceImplService ms = new MovieServiceImplService();

        MovieService proxy = ms.getMovieServiceImplPort();

        double value = proxy.getRating("Dabang3");
        System.out.println("Rating " + value);

    }
}
