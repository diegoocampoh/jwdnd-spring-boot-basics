package com.udacity.jwdnd.c1.review.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String landing(){
        return "login";
    }
}
