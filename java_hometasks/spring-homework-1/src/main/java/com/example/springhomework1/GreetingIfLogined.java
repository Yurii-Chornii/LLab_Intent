package com.example.springhomework1;


public class GreetingIfLogined implements Greeting {
    @Override
    public String sayHello() {
        return "Hello, logined user!";
    }
}
