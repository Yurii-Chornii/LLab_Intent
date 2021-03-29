package com.example.springhomework1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Value("${isLogined}")
    private boolean isLogined;

    @Bean
    public Greeting greeting() {
        if (isLogined) {
            return new GreetingIfLogined();
        } else {
            return new GreetingIfNotLogined();
        }
    }
}
