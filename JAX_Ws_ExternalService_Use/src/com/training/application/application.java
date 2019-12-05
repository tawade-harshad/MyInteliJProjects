package com.training.application;

import com.training.example.Weather;
import com.training.example.WeatherSoap;

public class application {

    public static void main(String[] args) {
        Weather weatherService = new Weather();
        WeatherSoap proxy =  weatherService.getWeatherSoap();
//        proxy.getWeatherInformation();
        System.out.println( proxy.getCityWeatherByZIP("33601"));
        System.out.println(proxy.getWeatherInformation());

    }
}
