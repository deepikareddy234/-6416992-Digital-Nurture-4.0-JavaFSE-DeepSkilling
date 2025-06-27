package com.example.junitspring;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeServiceTest {

    private EmployeeRepository employeeRepository = Mockito.mock(EmployeeRepository.class);

    private EmployeeService2 employeeService = new EmployeeService2();

    // Constructor injection for the mocked repository
    EmployeeServiceTest() {
        employeeService.employeeRepository = employeeRepository;
    }

    @Test
    void testGetEmployeeById_NotFound_ShouldThrowException() {
        // Given
        Long id = 999L;
        when(employeeRepository.findById(id)).thenReturn(Optional.empty());

        // When & Then
        EmployeeNotFoundException exception = assertThrows(EmployeeNotFoundException.class, () -> {
            employeeService.getEmployeeById(id);
        });

        // Check the exception message
        assertEquals("Employee not found with id: 999", exception.getMessage());

        // Verify repository interaction
        verify(employeeRepository, times(1)).findById(id);
    }
}
