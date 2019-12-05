package com.training.apps;

import com.training.services.MovieServiceImpl;
import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        try{
            Endpoint.publish("http://localhost:9090/rating", new MovieServiceImpl());
            System.out.println("Service Published");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
