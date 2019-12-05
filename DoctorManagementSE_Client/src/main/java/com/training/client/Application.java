package com.training.client;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class Application {

    public static void main(String[] args) {
        ClientBuilder builder = ClientBuilder.newBuilder();
        WebTarget target = builder.build().target("http://localhost:8888/DoctorManagement_war_exploded/");

        String resp = target.path("/webapi/medicine").request().get(String.class);

        System.out.println("Response from Server is :" + resp);

    }
}
