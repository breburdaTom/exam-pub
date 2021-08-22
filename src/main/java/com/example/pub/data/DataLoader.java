package com.example.pub.data;

import com.example.pub.model.Drink;
import com.example.pub.model.User;
import com.example.pub.repository.DrinkRepository;
import com.example.pub.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, DrinkRepository drinkRepository) {
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

            Drink whiskey = new Drink(
                    "whiskey",
                    3,
                    true
            );

            Drink gin = new Drink(
                    "gin",
                    2,
                    true
            );

            Drink beer = new Drink(
                    "beer",
                    1,
                    true
            );

            userRepository.saveAll(
                    List.of(tommy, arthur, finn, polly)
                );

            drinkRepository.saveAll(
                    List.of(whiskey, gin, beer)
            );

        };
    }
}
