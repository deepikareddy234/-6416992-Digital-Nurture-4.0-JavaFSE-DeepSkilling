package com.example.junitspring;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUserById(Long id) {
        // Dummy user for testing
        return new User(id, "Dummy User", "dummy@example.com");
    }
}
