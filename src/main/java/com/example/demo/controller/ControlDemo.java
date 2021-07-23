package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/value"},produces = {"text/html"})
public class ControlDemo {
    @GetMapping
    public String hello(){
        return "Praveen";
    }
}
