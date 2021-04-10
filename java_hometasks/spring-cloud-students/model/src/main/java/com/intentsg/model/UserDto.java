package com.intentsg.model;

import lombok.Builder;

@Builder
public class UserDto {
    private int userId;
    private String name;
    private String lastName;
}
