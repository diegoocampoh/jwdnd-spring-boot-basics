package com.udacity.jwdnd.c1.review.services.chat;

import com.udacity.jwdnd.c1.review.mapper.ChatMessageMapper;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private ChatMessageMapper chatMessageMapper;

    public ChatService(ChatMessageMapper chatMessageMapper) {
        this.chatMessageMapper = chatMessageMapper;
    }

    public void addChat(ChatMessageForm chatMessageForm){
        chatMessageMapper.insert(fromChatMessageForm(chatMessageForm));
    }

    public List<ChatMessage> getChats() {
        return chatMessageMapper.getUserMessages();
    }

    public ChatMessage fromChatMessageForm(ChatMessageForm chatMessageForm){
        String messageChatText =  switch (chatMessageForm.getMessageType()) {
            case SAY ->     chatMessageForm.getChatText();
            case SHOUT ->   chatMessageForm.getChatText().toUpperCase();
            case WHISPER -> chatMessageForm.getChatText().toLowerCase();
        };
        return new ChatMessage(null, chatMessageForm.getUsername(), messageChatText);
    }
}
