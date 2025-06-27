package com.example.junitspring;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // 🔥 Custom Query Method
    List<Employee> findByName(String name);
}
