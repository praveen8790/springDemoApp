package com.example.demo.repository;

import com.example.demo.entity.GreetingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GreetingRepository extends JpaRepository<GreetingsEntity,Long> {
}
