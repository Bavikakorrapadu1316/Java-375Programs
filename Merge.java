package Arrays;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        // 1. Initialize two sorted arrays
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        // 2. Create a destination array with the combined length
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // 3. Compare elements from both arrays and add the smaller one to 'merged'
        while (i < a.length && j < b.length) {
            merged[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }

        // 4. If any elements remain in array 'a', add them to 'merged'
        while (i < a.length) {
            merged[k++] = a[i++];
        }

        // 5. If any elements remain in array 'b', add them to 'merged'
        while (j < b.length) {
            merged[k++] = b[j++];
        }

        // 6. Print the result
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
