package com.intentsg.service.user.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    private int userId;
    private String name;
    private String lastName;
}
