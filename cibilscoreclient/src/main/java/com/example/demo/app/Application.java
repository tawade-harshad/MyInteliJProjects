package com.example.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Application {
    @Autowired
    private RestTemplate template;

    @Autowired
    private HttpEntity<String> entity;

    //CIBIL SCORE CALL FOR
    public String getScore() {
        String response = template.exchange("http://localhost:8888/cibilScore/A343434",
                HttpMethod.GET,
                entity,
                String.class).getBody();

        return response;
    }
}
