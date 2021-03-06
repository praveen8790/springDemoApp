package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Message {

    private String message;
    private String author;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Message() {
    }

    public Message(String message, String author) {
        this.message = message;
        this.author = author;
    }
}
