package Arrays;


	import java.util.Arrays;

	public class ArrayRotation {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};

	        // Check if array is empty to avoid errors
	        if (arr.length > 0) {
	            // 1. Store the first element
	            int first = arr[0];

	            // 2. Shift elements to the left
	            for (int i = 0; i < arr.length - 1; i++) {
	                arr[i] = arr[i + 1];
	            }

	            // 3. Place the first element at the last index
	            arr[arr.length - 1] = first;
	        }

	        System.out.println("Left Rotated Array: " + Arrays.toString(arr));
	    }
	}

