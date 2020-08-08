package com.klimkiewicz.audiofeel.controllers;

import com.klimkiewicz.audiofeel.UserRepository;
import com.klimkiewicz.audiofeel.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private final UserRepository userRepository;

    @Autowired
    public RegistrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register-new-user")
    public String registerNewUser(@ModelAttribute User user) {
        System.out.println(user);
        userRepository.save(user);
        return "redirect:/";
    }
}
