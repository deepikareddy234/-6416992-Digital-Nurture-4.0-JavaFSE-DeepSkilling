package LibraryManagementSystem;

public class LibraryApp {
    public static void main(String[] args) {
        Book[] catalog = {
            new Book("B201", "Zero to One", "Peter Thiel"),
            new Book("B202", "The Pragmatic Programmer", "Andrew Hunt"),
            new Book("B203", "Refactoring", "Martin Fowler"),
            new Book("B204", "The Mythical Man-Month", "Frederick P. Brooks Jr.")
        };

        // Linear search
        Book result1 = LibrarySearchUtil.linearSearch(catalog, "Refactoring");
        System.out.println("Linear Search -> " + (result1 != null ? result1 : "Book not found"));

        // Sort before binary search
        LibrarySearchUtil.sortBooks(catalog);

        // Binary search
        Book result2 = LibrarySearchUtil.binarySearch(catalog, "Zero to One");
        System.out.println("Binary Search -> " + (result2 != null ? result2 : "Book not found"));
    }
}
