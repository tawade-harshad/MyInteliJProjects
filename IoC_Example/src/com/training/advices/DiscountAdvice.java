package com.training.advices;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class DiscountAdvice {

    @Before("execution(public * *(..))")
    public void checkMethod(JoinPoint jp){
        System.out.println(jp.getArgs().length);
        System.out.println(jp.getTarget());
        System.out.println(jp.getSignature().getName());
    }
}
