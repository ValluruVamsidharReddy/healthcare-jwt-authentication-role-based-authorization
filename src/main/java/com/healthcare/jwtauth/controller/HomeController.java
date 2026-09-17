package com.healthcare.jwtauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Healthcare JWT Authentication and Role-Based Authorization is running successfully.";
    }
}