package com.racloop.api.ranga.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    @Value("${welcome.message}")
    private String welcomeMessage;

    public String WelcomeServices(){

        System.out.println("SERVICE IS WORKING\n\n");
        return welcomeMessage;
    }
}
