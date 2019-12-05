package com.training.services;

import com.training.beans.Director;
import com.training.ifaces.MovieService;
import javax.jws.WebService;

@WebService(endpointInterface = "com.training.ifaces.MovieService")
public class MovieServiceImpl implements MovieService {
    @Override
    public double getRating(String movieName) {
        double rating = 3.2;

        if(movieName.equals("Dabang3")){
            rating = 4.2;
        }
        return rating;
    }

    @Override
    public Director getTopDirector(String movieType) {

        Director topDirector = new Director("Bhansali",93534,"Hindi");

        if(movieType.equalsIgnoreCase("bhojpuri")){
            topDirector= new Director("Sharma",34324,"Bhojpuri");
        }
        return topDirector;
    }

    public MovieServiceImpl() {
    }
}
