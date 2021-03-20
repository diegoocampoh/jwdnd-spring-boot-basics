package com.udacity.jwdnd.c1.review.model;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String username;
    private String salt;
    private String password;
    private String firstName;
    private String lastName;
}
