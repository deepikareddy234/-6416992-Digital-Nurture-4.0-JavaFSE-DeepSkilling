package EmployeeManagementSystem;

public class EmployeeSystemApp {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        Employee e1 = new Employee("E001", "Prasad Reddy", "Manager", 75000);
        Employee e2 = new Employee("E002", "Anil Roa", "Developer", 55000);
        Employee e3 = new Employee("E003", "Manjula Devi", "Tester", 45000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        manager.showAllEmployees();

        // Search employee
        Employee search = manager.searchById("E002");
        System.out.println("\nSearch Result: " + (search != null ? search : "Employee not found"));

        // Delete employee
        boolean deleted = manager.deleteById("E001");
        System.out.println("\nDelete Status: " + (deleted ? "Deleted successfully" : "Not found"));

        manager.showAllEmployees();
    }
}

