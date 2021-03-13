package com.udacity.jwdnd.c1.review.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {

    public List<String> messages;

    @PostConstruct
    public void postConstruct(){
        this.messages = new ArrayList<>();
    }

    public void addMessage(String message){
        this.messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
