package Ecommerce_Platform_Search_Function;

public class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public String toString() {
        return productId + " | " + productName + " | " + category;
    }
}

