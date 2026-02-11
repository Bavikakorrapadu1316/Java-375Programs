package Arrays;
import java.util.Arrays;

public class KthMinMax {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 2};
        int k = 2; // Find the 2nd smallest and 2nd largest

        // Safety check for k
        if (k > 0 && k <= arr.length) {
            // Sort the array in ascending order
            Arrays.sort(arr);

            // Access Kth smallest (index is k-1)
            int kthSmallest = arr[k - 1];

            // Access Kth largest (index is length-k)
            int kthLargest = arr[arr.length - k];

            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println(k + "nd Smallest: " + kthSmallest);
            System.out.println(k + "nd Largest: " + kthLargest);
        } else {
            System.out.println("Invalid value of k.");
        }
    }
}
