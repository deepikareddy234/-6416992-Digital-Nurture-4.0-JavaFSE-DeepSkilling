package com.example.mockito_mock_dependencies;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc   // ✅ Setup MockMvc for integration testing
public class UserIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean    // ✅ Mock the service in the context
    private UserService userService;

    @Test
    void testGetUserIntegrationWithMockedService() throws Exception {
        // Given
        User user = new User(1L, "Suresh");

        Mockito.when(userService.getUserById(1L)).thenReturn(user);

        // When & Then
        mockMvc.perform(get("/users/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Suresh"));
    }
}
