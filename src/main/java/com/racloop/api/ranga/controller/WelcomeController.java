package com.racloop.api.ranga.controller;

import com.racloop.api.ranga.configuration.BasicConfiguration;
import com.racloop.api.ranga.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController {

    @Autowired
    public WelcomeService service;

    @Autowired
    public BasicConfiguration configuration;

    @RequestMapping("/welcome")
    public String Welcome(){

        System.out.println("\n\nCONTROLLER IS WORKING\n\n");
        return service.WelcomeServices();
    }

    @RequestMapping("/dynamic-configuration")
    public Map DynamicConfiguration(){

        System.out.println("\n\nDYNAMIC CONFIGURATION IS WORKING\n\n");

        Map map = new HashMap();
        map.put("message",configuration.getMessage());
        map.put("number", configuration.getNumber());
        map.put("value", configuration.isValue());
        return map;
}
}
