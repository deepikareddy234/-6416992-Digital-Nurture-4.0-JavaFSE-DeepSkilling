package EmployeeManagementSystem;

public class EmployeeManager {
    private Employee[] employeeList;
    private int size;

    public EmployeeManager(int capacity) {
        employeeList = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (size < employeeList.length) {
            employeeList[size++] = emp;
            System.out.println("Added: " + emp);
        } else {
            System.out.println("Employee array full. Cannot add more.");
        }
    }

    public void showAllEmployees() {
        System.out.println("\n--- Employee List ---");
        for (int i = 0; i < size; i++) {
            System.out.println(employeeList[i]);
        }
    }

    public Employee searchById(String id) {
        for (int i = 0; i < size; i++) {
            if (employeeList[i].getEmployeeId().equalsIgnoreCase(id)) {
                return employeeList[i];
            }
        }
        return null;
    }

    public boolean deleteById(String id) {
        for (int i = 0; i < size; i++) {
            if (employeeList[i].getEmployeeId().equalsIgnoreCase(id)) {
                // Shift elements to left
                for (int j = i; j < size - 1; j++) {
                    employeeList[j] = employeeList[j + 1];
                }
                employeeList[--size] = null;
                return true;
            }
        }
        return false;
    }
}

