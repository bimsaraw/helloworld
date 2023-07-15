package com.ijse.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot Get Mapping!";
    }

    @PostMapping("/hello") 
    public String hello_post() {
        return "Hello Spring Boot Post Mapping!";
    }
}
