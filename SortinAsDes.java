package Arrays;
import java.util.Arrays;
import java.util.Collections;

public class SortinAsDes {
    public static void main(String[] args) {
        // 1. Ascending Order (Simple int array)
        int[] arr = {5, 2, 8, 1};
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        // 2. Descending Order (Requires Integer wrapper class)
        Integer[] arrDesc = {5, 2, 8, 1};
        Arrays.sort(arrDesc, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arrDesc));
    }
}

