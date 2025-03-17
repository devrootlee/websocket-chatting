package com.example.websocket.chatting.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "chatroom")
public class Chatroom {
    @Id
    private String id;
    private String initiatorNickname;
    private String participantNickname;
}
