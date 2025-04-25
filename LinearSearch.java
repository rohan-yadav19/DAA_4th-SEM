
public class LinearSearch {
    // Function to perform linear search
    public static int linearSearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;  // Return the index if found
            }
        }
        return -1;  // Return -1 if not found
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40};
        int key = 30; // Element to search for

        // Record the start time
        long startTime = System.nanoTime();

        // Perform linear search
        int index = linearSearch(arr, key);

        // Record the end time
        long endTime = System.nanoTime();

        // Compute the time taken
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

