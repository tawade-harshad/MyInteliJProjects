package com.example.demo.config;

import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

 /*   @Bean
    public Feign.Builder interceptor(){
//        return new BasicAuthenticationInterceptor("india","india");
        return Feign.builder().requestInterceptor(new BasicAuthRequestInterceptor("india","india"));
    }*/

    @Bean
    public RequestInterceptor interceptor(){
        RequestInterceptor requestInterceptor = new BasicAuthRequestInterceptor("india","india");
        return requestInterceptor;
    }
}
