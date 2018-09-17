package com.music.demo.controller;

import com.music.demo.model.Question;
import com.music.demo.model.User;
import com.music.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/registration")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
}
