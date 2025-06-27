package com.example.junitspring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testCreateAndGetEmployee() throws Exception {
        // Create an employee
        Employee employee = new Employee();
        employee.setName("Johnson");
        employee.setEmail("Johnson@example.com");

        // POST request to create employee
        String response = mockMvc.perform(post("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(employee)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.name").value("Johnson"))
                .andExpect(jsonPath("$.email").value("Johnson@example.com"))
                .andReturn()
                .getResponse()
                .getContentAsString();

        // Extract ID from response
        Employee createdEmployee = objectMapper.readValue(response, Employee.class);
        Long employeeId = createdEmployee.getId();

        // GET request to fetch employee
        mockMvc.perform(get("/employees/" + employeeId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(employeeId))
                .andExpect(jsonPath("$.name").value("Johnson"))
                .andExpect(jsonPath("$.email").value("Johnson@example.com"));
    }
}
