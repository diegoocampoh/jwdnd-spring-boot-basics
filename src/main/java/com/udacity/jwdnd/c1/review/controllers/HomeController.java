package com.udacity.jwdnd.c1.review.controllers;

import com.udacity.jwdnd.c1.review.services.MessageForm;
import com.udacity.jwdnd.c1.review.services.MessageListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private MessageListService messageService;

    public HomeController(MessageListService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/home")
    public String landing(
            @ModelAttribute("newMessage") MessageForm newMessage,
            Model model
    ){
        model.addAttribute("greetings", messageService.getMessages());
        return "home";
    }

    @PostMapping("/home")
    public String addMessage(
            @ModelAttribute("newMessage") MessageForm messageForm,
            Model model
    ){
        messageService.addMessage(messageForm.getText());
        model.addAttribute("greetings", messageService.getMessages());
        messageForm.setText("");
        return "home";
    }
}


