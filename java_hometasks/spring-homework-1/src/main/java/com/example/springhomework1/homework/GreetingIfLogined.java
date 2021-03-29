package com.example.springhomework1.homework;


public class GreetingIfLogined implements Greeting {
    @Override
    public String sayHello() {
        return "Hello, logined user!";
    }
}
