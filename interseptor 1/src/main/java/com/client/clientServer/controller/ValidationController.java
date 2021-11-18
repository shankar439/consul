package com.client.clientServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {
    @RequestMapping("/welcome")
    public String validateApi() {
        return "welcome message from 1111";
    }
}
