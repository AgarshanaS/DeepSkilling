/*
 * Step 1: Understand Asymptotic Notation
 *
 * ➤ Big O Notation:
 *    - Big O notation describes the performance (time or space) of an algorithm
 *      as the input size (n) grows.
 *    - It focuses on the upper bound (worst-case) of algorithm performance.
 *    - Helps compare different algorithms and optimize for scalability.
 *
 * ➤ Common Big O Examples:
 *    - O(1)   → Constant time (array access)
 *    - O(n)   → Linear time (loop over array)
 *    - O(log n) → Logarithmic time (binary search)
 *    - O(n^2) → Quadratic time (nested loops)
 *
 * ➤ Search Operation Scenarios:
 * 
 *    1. Linear Search:
 *       - Best Case:    O(1)    → Target is first element
 *       - Average Case: O(n)    → Target is somewhere in the middle
 *       - Worst Case:   O(n)    → Target is last or not present
 * 
 *    2. Binary Search (on sorted array):
 *       - Best Case:    O(1)    → Target is middle element
 *       - Average Case: O(log n)
 *       - Worst Case:   O(log n)
 *
 */
import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

class SearchEngine {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0)
                return products[mid];
            else if (comparison < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shirt", "Clothing"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "Book", "Education")
        };

        // Linear Search Test
        Product result1 = SearchEngine.linearSearch(products, "Mobile");
        System.out.println(result1 != null ? "Found: " + result1.productName : "Not Found");

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search Test
        Product result2 = SearchEngine.binarySearch(products, "Mobile");
        System.out.println(result2 != null ? "Found: " + result2.productName : "Not Found");
    }
}