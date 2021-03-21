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

    public void clean(){
        this.chatText = "";
        this.messageType = MessageType.SAY;
    }

}
