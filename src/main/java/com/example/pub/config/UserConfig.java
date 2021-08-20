package com.example.pub.config;

import com.example.pub.model.User;
import com.example.pub.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User tommy = new User(
                    "Tommy",
                    true,
                    true,
                    300
            );

            User arthur = new User(
                    "Arthur",
                    true,
                    true,
                    40
            );

            User finn = new User(
                    "Finn",
                    true,
                    false,
                    5
            );

            User polly = new User(
                    "Polly",
                    false,
                    true,
                    150
            );

            repository.saveAll(
                    List.of(tommy, arthur, finn, polly)
                );

        };
    }
}
