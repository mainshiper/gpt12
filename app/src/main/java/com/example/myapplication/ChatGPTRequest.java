package com.example.myapplication;

import java.util.List;

public class ChatGPTRequest { //chatgpt 요청클래스
    private String model;
    private List<ChatMsg> messages;

    public ChatGPTRequest(String model, List<ChatMsg> messages) {
        this.model = model;
        this.messages = messages;
    }
}
