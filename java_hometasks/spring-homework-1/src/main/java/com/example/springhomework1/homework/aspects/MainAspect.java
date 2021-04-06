package com.example.springhomework1.homework.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Aspect
@Component
public class MainAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(* com.example.springhomework1.homework.controllers.MainController.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("method was executed {}", joinPoint);
    }

    @AfterReturning(pointcut = "execution(* com.example.springhomework1.homework.services.TopicsList.*(..))", returning = "returningObject")
    public void afterReturn(JoinPoint joinPoint, Object returningObject) {
        logger.info("{} returned with value {}", joinPoint, returningObject);
    }
}
