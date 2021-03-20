package com.udacity.jwdnd.c1.review.services.chat;

import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private List<ChatMessage> chats;

    @PostConstruct
    public void postConstruct(){
        chats = new ArrayList<>();
    }

    public void addChat(ChatMessage chat){
        chats.add(chat);
    }

    public List<ChatMessage> getChats() {
        return chats;
    }
}
