package com.udacity.jwdnd.c1.review.services.chat;

import com.udacity.jwdnd.c1.review.model.ChatMessage;
import lombok.Data;

@Data
public class ChatMessageForm {
    private String username;
    private String chatText;
    private MessageType messageType = MessageType.SAY;

    public enum MessageType {
        SAY,
        SHOUT,
        WHISPER
    }

    public ChatMessage toChatMessage(){
        String messageChatText =  switch (messageType) {
            case SAY ->     chatText;
            case SHOUT ->   chatText.toUpperCase();
            case WHISPER -> chatText.toLowerCase();
        };
        return new ChatMessage(username, messageChatText);
    }

    public void clean(){
        this.chatText = "";
        this.messageType = MessageType.SAY;
    }

}
