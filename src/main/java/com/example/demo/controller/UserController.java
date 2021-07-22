package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class UserController {
    @RequestMapping(value = {"","/hello","/"})
    public String sayHello(){
        return "Hello From Bridgelabz";
    }

    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@PathParam(value = "name") String name){
        return "Hello" + name;
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello" + name;
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello "+user.getFirstname() + user.getLastname();
    }

}
