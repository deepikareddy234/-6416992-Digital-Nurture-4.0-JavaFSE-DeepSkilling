package InventoryManagementSystem;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("E1001", "USB Cable", 75, 150.00);
        Product p2 = new Product("E1002", "Power Bank", 40, 899.00);
        Product p3 = new Product("E1003", "Laptop Stand", 25, 1299.00);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.updateProduct("E1002", 50, 849.00);  // updating Power Bank

        manager.deleteProduct("E1001"); // deleting USB Cable

        manager.showInventory();
    }
}

