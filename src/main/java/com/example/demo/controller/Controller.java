package com.example.demo.controller;

import com.example.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class Controller {

    @Autowired
    private Message message;

    @PostMapping
    public Message CreateMessage(@RequestBody Message msg) {
        this.message.setAuthor(msg.getAuthor());
        this.message.setMessage(msg.getMessage());
        return message;
    }


    @RequestMapping(value = "/msg", method = RequestMethod.GET)
    public Message getMessage() {
        return new Message("hello,, How r u ?", "praveen");
    }

    @GetMapping
    public ResponseEntity<String> getName() {
        return new ResponseEntity<>("praveen", HttpStatus.OK);
    }
}
