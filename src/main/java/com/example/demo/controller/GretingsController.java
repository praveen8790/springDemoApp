package com.example.demo.controller;

import com.example.demo.entity.GreetingsEntity;
import com.example.demo.entity.User;
import com.example.demo.services.IGreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GretingsController {

    @Autowired
    private IGreetingServices greetingService;
    @GetMapping
    public GreetingsEntity showMessage(@RequestParam(value = "name",defaultValue = "world") String name ){
        User user = new User();
        user.setFirstname(name);
        return greetingService.addGreeting(user);
     }
     @GetMapping("/user")
    public GreetingsEntity update(@RequestParam(value = "name",defaultValue = "world") String name ){
        User user = new User();
        user.setFirstname(name);
        return greetingService.updateGreetingByID(3L,user);
    }
    @GetMapping("/users")
    public List<GreetingsEntity> showall(){
        return greetingService.getGreeting();
    }
}
