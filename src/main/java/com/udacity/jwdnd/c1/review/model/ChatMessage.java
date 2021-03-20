package com.udacity.jwdnd.c1.review.model;

import lombok.Data;

@Data
public class ChatMessage {
    private Integer messageId;
    private String username;
    private String chatText;
}
