package com.example.demo.services;

import com.example.demo.entity.GreetingsEntity;
import com.example.demo.entity.User;

import java.util.List;

public interface IGreetingServices {
    GreetingsEntity addGreeting(User user);
    List<GreetingsEntity> getGreeting();
    GreetingsEntity updateGreetingByID(Long id,User user);
}
