package com.everyoneblogsspring.everyonesblogs.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class loggingAspect {
    @Before("execution(* com.everyoneblogsspring.everyonesblogs..*.*(..))")
public void loggin (JoinPoint point){
System.out.println("O método: " + point.getSignature().getName() + " está prestes a ser executado");
}
}
