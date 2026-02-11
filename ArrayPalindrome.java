package Arrays;
import java.util.Arrays;

public class ArrayPalindrome {
    public static void main(String[] args) {
        // Test data
        int[] arr = {1, 2, 3, 2, 1}; 
        
        boolean isPal = true;
        
        // Loop runs only for half the array (O(n/2) efficiency)
        for (int i = 0; i < arr.length / 2; i++) {
            // Compare element at front with element at corresponding back
            if (arr[i] != arr[arr.length - 1 - i]) { 
                isPal = false; 
                break; // Stop immediately if a mismatch is found
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Is Palindrome? " + isPal);
    }
}
