package com.training.apps;

import com.training.config.AopConfig;
import com.training.ifaces.Payment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);

        //Accessing Bean by Type
        Payment  myPayment = ctx.getBean(Payment.class);
        System.out.println(myPayment.cardPayment("amex",4300));
        System.out.println(myPayment.cashPayment(2000));
    }

}
