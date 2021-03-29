package com.example.springhomework1;


public class GreetingIfNotLogined implements Greeting {
    @Override
    public String sayHello() {
        return "Hello, not logined user!";
    }
}
