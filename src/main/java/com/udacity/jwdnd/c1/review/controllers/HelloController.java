package com.udacity.jwdnd.c1.review.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String landing(Model model){
        model.addAttribute("mensajeHello", "Hola");
        return "hello";
    }
}
