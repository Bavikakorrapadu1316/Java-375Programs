package Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        // Initialize the Map
        Map<Integer, Integer> freq = new HashMap<>();

        // Loop through the array
        for (int n : arr) {
            // getOrDefault(key, default) returns the current count or 0 if not found
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Print the frequency results
        System.out.println("Element Frequencies: " + freq);
    }
}
