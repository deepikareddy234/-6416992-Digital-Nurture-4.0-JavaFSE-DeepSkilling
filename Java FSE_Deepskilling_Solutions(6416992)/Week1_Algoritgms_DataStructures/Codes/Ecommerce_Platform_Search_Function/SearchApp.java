package Ecommerce_Platform_Search_Function;

public class SearchApp {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P1001", "Laptop", "Electronics"),
            new Product("P1002", "Shoes", "Footwear"),
            new Product("P1003", "Mobile", "Electronics"),
            new Product("P1004", "Backpack", "Accessories")
        };

        // Linear Search
        Product result1 = SearchUtil.linearSearch(products, "Mobile");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        // Sort before Binary Search
        SearchUtil.sortProducts(products);

        // Binary Search
        Product result2 = SearchUtil.binarySearch(products, "Laptop");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}
