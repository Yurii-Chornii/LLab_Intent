package com.example.springhomework1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MyConfiguration.class)
@SpringBootApplication
public class SpringHomework1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringHomework1Application.class, args);
    }

}
