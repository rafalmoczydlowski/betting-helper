package com.rafinha.bettinghelper.controller;

import com.rafinha.bettinghelper.security.RegistrationForm;
import com.rafinha.bettinghelper.security.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistryController {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public RegistryController(UserRepository repository, PasswordEncoder encoder) {
        this.userRepository = repository;
        this.passwordEncoder = encoder;
    }

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @PostMapping
    public String processRegistration(RegistrationForm form) {
        userRepository.save(form.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
