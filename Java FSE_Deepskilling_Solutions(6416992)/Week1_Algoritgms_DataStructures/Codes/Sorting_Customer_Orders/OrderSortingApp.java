package Sorting_Customer_Orders;

public class OrderSortingApp {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("ORD001", "Arjun", 599.99),
            new Order("ORD002", "Varun", 2499.50),
            new Order("ORD003", "Chaithanya", 1299.00),
            new Order("ORD004", "Deepika", 199.75)
        };

        System.out.println("Original Orders:");
        SortUtil.printOrders(orders);

        // Bubble Sort
        System.out.println("\nSorted using Bubble Sort (High to Low):");
        SortUtil.bubbleSort(orders);
        SortUtil.printOrders(orders);

        // Reset orders array
        Order[] orders2 = {
            new Order("ORD001", "Arjun", 599.99),
            new Order("ORD002", "Varun", 2499.50),
            new Order("ORD003", "Chaithanya", 1299.00),
            new Order("ORD004", "Deepika", 199.75)
        };

        // Quick Sort
        System.out.println("\nSorted using Quick Sort (High to Low):");
        SortUtil.quickSort(orders2, 0, orders2.length - 1);
        SortUtil.printOrders(orders2);
    }
}

