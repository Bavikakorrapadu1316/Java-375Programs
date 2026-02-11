package Arrays;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Works for both even and odd lengths

        // Reversal Logic
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Output the result
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

