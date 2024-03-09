package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MyFirstConfiguration {

    @Bean
    public List<String> colors() {
        return List.of("RED", "BLUE", "GREEN");
    }
}
