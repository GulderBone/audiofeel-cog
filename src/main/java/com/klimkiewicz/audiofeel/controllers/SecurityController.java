package com.klimkiewicz.audiofeel.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/username")
    public String currentUserName(Authentication authentication) {
        return authentication.getName();
    }
}
