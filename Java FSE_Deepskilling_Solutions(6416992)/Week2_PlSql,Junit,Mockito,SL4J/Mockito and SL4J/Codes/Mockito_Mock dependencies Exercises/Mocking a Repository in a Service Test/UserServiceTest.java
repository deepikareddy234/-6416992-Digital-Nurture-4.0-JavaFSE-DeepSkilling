package com.example.mockito_mock_dependencies;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)  // ✅ Enable Mockito
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;  // ✅ Mocked repository

    @InjectMocks
    private UserService userService;        // ✅ Inject mock into service

    @Test
    void testGetUserById() {
        // Given - Prepare mock data
        User user = new User(1L, "Anjali");
        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        // When - Call service method
        User result = userService.getUserById(1L);

        // Then - Assert results
        assertEquals(1L, result.getId());
        assertEquals("Anjali", result.getName());
    }
}
