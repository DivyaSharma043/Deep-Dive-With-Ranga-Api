package com.racloop.api.ranga.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new User("Divya", "Admin"));
        repository.save(new User("Ashish", "User"));
        repository.save(new User("Shabnam", "Admin"));
        repository.save(new User("Shivam", "User"));

        for (User user: repository.findAll())
        {
            log.info(user.toString());
        }
    }
}
