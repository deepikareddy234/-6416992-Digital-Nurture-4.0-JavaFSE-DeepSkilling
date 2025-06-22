package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearchUtil {

    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static void sortBooks(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    public static Book binarySearch(Book[] books, String targetTitle) {
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = books[mid].getTitle().compareToIgnoreCase(targetTitle);

            if (compare == 0) return books[mid];
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }
}
