package com.racloop.api.ranga.controller;

import com.racloop.api.ranga.api_project.ApiProjectApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiProjectApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SurveyControllerIT {

    @LocalServerPort
    private int port;

    @Test
    public void Test() {
        System.out.println("Test port of Survey Controller is: " + port);
    }
}
