package com.udacity.jwdnd.c1.review.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    private Integer messageId;
    private String username;
    private String messagetext;
}
