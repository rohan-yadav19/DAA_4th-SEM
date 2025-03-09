import java.util.Arrays;

public class BinarySearch {
    // Function to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (arr[mid] == key)
                return mid;

            // If key is greater, ignore the left half
            if (arr[mid] < key)
                left = mid + 1;
            else // If key is smaller, ignore the right half
                right = mid - 1;
        }
        
        return -1; // Element not found
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int key = 30; // Element to search for

        // Measure start time
        long startTime = System.nanoTime();

        // Perform binary search
        int index = binarySearch(arr, key);

        // Measure end time
        long endTime = System.nanoTime();

        // Compute time taken
        long timeTaken = endTime - startTime;

        // Display results
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("Time taken (nanoseconds): " + timeTaken);
    }
}
