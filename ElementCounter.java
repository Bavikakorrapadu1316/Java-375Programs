package Arrays;
public class ElementCounter {
    public static void main(String[] args) {
        // Sample array with positive, negative, and zero values
        int[] arr = {10, -5, 0, 3, -1, 0, 7};

        int p = 0, n = 0, z = 0;

        // Iterate through each number in the array
        for (int num : arr) {
            if (num > 0) {
                p++;    // Increment positive count
            } else if (num < 0) {
                n++;    // Increment negative count
            } else {
                z++;    // Increment zero count
            }
        }

        // Print the final counts
        System.out.println("Positive numbers: " + p);
        System.out.println("Negative numbers: " + n);
        System.out.println("Zero elements: " + z);
    }
}
