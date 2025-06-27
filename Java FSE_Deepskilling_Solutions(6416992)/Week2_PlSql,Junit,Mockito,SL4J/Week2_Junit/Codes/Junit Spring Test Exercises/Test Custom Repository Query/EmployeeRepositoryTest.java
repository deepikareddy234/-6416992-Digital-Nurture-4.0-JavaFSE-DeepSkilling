package com.example.junitspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testFindByName() {
        // Given - setup data
        Employee emp1 = new Employee(null, "Ravi", "ravi@example.com");
        Employee emp2 = new Employee(null, "Sneha", "sneha@example.com");
        Employee emp3 = new Employee(null, "Ravi", "ravi.kumar@example.com");

        employeeRepository.save(emp1);
        employeeRepository.save(emp2);
        employeeRepository.save(emp3);

        // When - invoke custom query
        List<Employee> employeesWithNameRavi = employeeRepository.findByName("Ravi");

        // Then - verify results
        Assertions.assertEquals(2, employeesWithNameRavi.size());
        Assertions.assertTrue(employeesWithNameRavi.stream().allMatch(e -> e.getName().equals("Ravi")));
    }
}
