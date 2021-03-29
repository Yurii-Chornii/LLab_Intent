package com.example.springhomework1;

import org.springframework.stereotype.Component;

@Component
public class GreetingIfNotLogined implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello, not logined user!");
    }
}
