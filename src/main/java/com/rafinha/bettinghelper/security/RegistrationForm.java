package com.rafinha.bettinghelper.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Setter
@Getter
@RequiredArgsConstructor
public class RegistrationForm {
    private String username;
    private String password;
    private String fullName;
    private String email;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(username, passwordEncoder.encode(password), fullName, email);
    }
}
