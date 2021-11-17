package com.racloop.api.ranga.api_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.racloop.api.ranga.")
public class ApiProjectApplication {

	public static void main(String[] args) {

	ApplicationContext ctx = SpringApplication.run(ApiProjectApplication.class, args);
		System.out.println("\n\nMain Application Working\n\n");
	}

}
