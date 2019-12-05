package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public BasicAuthenticationInterceptor interceptor(){
        return new BasicAuthenticationInterceptor("india","india");
    }

    @Bean
    public RestTemplate restTemplate(){

        RestTemplate template = new RestTemplate();
        template.getInterceptors().add(interceptor());
        return template;
    }

    @Bean
    public HttpHeaders header(){
        HttpHeaders header = new HttpHeaders();

        header.setAccept(Arrays.asList( MediaType.APPLICATION_JSON));
        return header;
    }

    @Bean
    public HttpEntity<String> entity(){
        HttpEntity entity = new HttpEntity<String>(header());

        return entity;
    }
}
