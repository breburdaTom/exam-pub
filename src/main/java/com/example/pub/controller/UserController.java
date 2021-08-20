package com.example.pub.controller;

import com.example.pub.model.User;
import com.example.pub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping @RequestMapping(path = "users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping @RequestMapping(path = "user/{id}", method = RequestMethod.GET)
    public User getUserDetails(@PathVariable long id) {
        return userService.getUserById(id);
    }

}
