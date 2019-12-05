package com.training.apps;

import com.training.beans.Hospital;
import com.training.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        //Accessing Bean by Type
//        Hospital hosp = ctx.getBean(Hospital.class);
//        System.out.println(hosp);

        //Get a bean by Type Hospital.class and with a Id Leelavathi
        Hospital leela = ctx.getBean("leelavathi", Hospital.class);
        System.out.println(leela);

        //Accessing Bean by Id
        Hospital sleela = (Hospital) ctx.getBean("apollo");
        System.out.println(sleela);

        //Spring Bean are singleton by Default
        System.out.println(ctx.isSingleton("leelavathi"));
        System.out.println(ctx.isPrototype("leelavathi"));

        //Same Object Reference
        System.out.println(leela.hashCode());
        System.out.println(sleela.hashCode());
        ctx.close();
    }
}

