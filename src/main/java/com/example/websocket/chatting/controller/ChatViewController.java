package com.example.websocket.chatting.controller;

import com.example.websocket.chatting.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatViewController {

    @GetMapping("/")
    public String loginPage() {
        return "index";
    }

    @GetMapping("/signup")
    public String signUpPage() {
        return "signup";
    }

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        System.out.println(message.getSender());
        System.out.println(message.getContent());
        System.out.println(message.getType());
        return message;
    }
}
