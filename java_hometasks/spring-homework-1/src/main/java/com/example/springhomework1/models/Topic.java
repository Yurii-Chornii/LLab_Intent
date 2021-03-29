package com.example.springhomework1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Topic {
    private Long id;
    private String name;
    private String theme;
    private Date date;
}
