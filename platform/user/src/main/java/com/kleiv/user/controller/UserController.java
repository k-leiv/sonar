package com.kleiv.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello!";
    }
}
