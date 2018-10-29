package com.code.sundrycash.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppInDevelopmentPhase {
    final String MESSAGE = "App in development phase";

    @RequestMapping("/")
    public String appInProgress(){
        return MESSAGE;
    }

}
