package com.racloop.api.ranga.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String WelcomeServices(){

        System.out.println("SERVICE IS WORKING\n\n");
        return "Hello Welcome to my Service";
    }
}
