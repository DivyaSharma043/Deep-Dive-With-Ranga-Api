package com.racloop.api.ranga.controller;

import com.racloop.api.ranga.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    public WelcomeService service;

    @RequestMapping("/welcome")
    public String Welcome(){

        System.out.println("\n\nCONTROLLER IS WORKING\n\n");
        return service.WelcomeServices();
    }
}
