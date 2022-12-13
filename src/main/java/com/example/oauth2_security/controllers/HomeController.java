package com.example.oauth2_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home-help")

public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "Hello and Welcome";
    }
}
