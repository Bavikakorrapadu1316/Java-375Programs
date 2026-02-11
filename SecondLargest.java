package Arrays;


	import java.util.Arrays;
	public class SecondLargest {
	
	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 1};

	        // Handle arrays with less than 2 elements
	        if (arr.length < 2) {
	            System.out.println("Array must have at least two elements.");
	            return;
	        }

	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // Access second smallest and second largest
	        int secondSmallest = arr[1];
	        int secondLargest = arr[arr.length - 2];

	        System.out.println("Sorted Array: " + Arrays.toString(arr));
	        System.out.println("Second Smallest: " + secondSmallest);
	        System.out.println("Second Largest: " + secondLargest);
	    }
	}
