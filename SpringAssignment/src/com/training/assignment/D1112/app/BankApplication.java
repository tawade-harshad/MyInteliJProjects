package com.training.assignment.D1112.app;

import com.training.assignment.D1112.beans.Bank;
import com.training.assignment.D1112.config.BankConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BankConfig.class);
        Bank b1 = ctx.getBean(Bank.class);

        System.out.println(b1.getBankMap());

    }

}
