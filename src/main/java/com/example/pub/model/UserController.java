package com.example.pub.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "John",
                        true,
                        true,
                        40
                )
        );
    }

}
