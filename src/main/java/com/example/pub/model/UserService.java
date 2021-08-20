package com.example.pub.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
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
