package com.racloop.api.ranga.api_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.racloop")

public class
ApiProjectApplication {

	public static void main(String[] args) {

	ApplicationContext ctx =SpringApplication.run(ApiProjectApplication.class, args);
		System.out.println("\n\nMain Application Working\n\n");
	}


	@Profile("prod")
	@Bean
	public String dummy()
	{
		return "Racloop";
	}
}
