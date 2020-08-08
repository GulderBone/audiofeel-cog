package com.klimkiewicz.audiofeel.controllers;

import com.klimkiewicz.audiofeel.models.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageMappingController {

    @GetMapping("/")
    public String home(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        if (username.equals("anonymousUser")) {
            username = "Niezalogowany";
        }
        model.addAttribute("username", username);
        return ("index");
    }

    @GetMapping("/register")
    public String user(Model model) {
        model.addAttribute("nowyUzytkownik", new User());
        return ("register");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}
