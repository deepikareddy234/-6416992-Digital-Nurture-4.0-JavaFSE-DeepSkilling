package InventoryManagementSystem;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Product deleted: " + removed);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void showInventory() {
        System.out.println("\n--- Inventory List ---");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
