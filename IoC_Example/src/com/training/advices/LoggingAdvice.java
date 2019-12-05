package com.training.advices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(1)
public class LoggingAdvice {

    Logger log = LogManager.getLogger();

    @Around("execution(* com.training.beans.PaymentImpl.*(..))")
    public Object loggingAdvice(ProceedingJoinPoint pjp) throws Throwable{

        log.info("Before Executing Method");
        Object obj = pjp.proceed();
        obj = (double) obj * 1.1;
        System.out.println(obj);
        log.info("After Executing Method");

        return obj;
    }
}
