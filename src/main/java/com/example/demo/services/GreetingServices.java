package com.example.demo.services;

import com.example.demo.entity.GreetingsEntity;
import com.example.demo.entity.User;
import com.example.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServices implements IGreetingServices {
    @Autowired
    private GreetingRepository greetingRepository;

    public static final String template="Hello %s!";
    @Override
    public GreetingsEntity addGreeting(User user) {
        return greetingRepository.save(new GreetingsEntity(String.format(
                template,(user.toString().isEmpty())? "hello world" : user.toString()
        )));
    }


    public List<GreetingsEntity> getGreeting() {
        return greetingRepository.findAll();
    }

    @Override
    public GreetingsEntity updateGreetingByID(Long id, User user) {
        return greetingRepository.findById(id).map(greetingsEntity -> {
            greetingsEntity.setMessage(String.format(
                    template, (user.toString().isEmpty()) ? "hello world" : user.toString()));
            return greetingRepository.save(greetingsEntity);
        }).get();
    }
}
