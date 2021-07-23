package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstname;
    private String lastname;

    @Override
    public String toString() {
        return String.format("%s",getFirstname());
    }
}
