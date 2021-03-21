package com.udacity.jwdnd.c1.review.controllers;

import com.udacity.jwdnd.c1.review.services.chat.ChatMessageForm;
import com.udacity.jwdnd.c1.review.services.chat.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class ChatController {

    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public String landing(
            @ModelAttribute("newChat") ChatMessageForm newChat,
            Model model
    ){
        model.addAttribute("chats", chatService.getChats());
        return "chat";
    }

    @PostMapping("/chat")
    public String sendChat(
            @ModelAttribute("newChat") ChatMessageForm newChat,
            Model model,
            Principal principal
    ){
        newChat.setUsername(principal.getName());
        chatService.addChat(newChat);
        newChat.clean();
        model.addAttribute("chats", chatService.getChats());
        return "chat";
    }


}
