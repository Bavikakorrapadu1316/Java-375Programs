package Arrays;


	import java.util.Arrays;

	public class ArrayEquality {
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3};
	        int[] arr2 = {1, 2, 3};
	        int[] arr3 = {3, 2, 1};

	        // Standard content comparison
	        boolean isEqual12 = Arrays.equals(arr1, arr2); 
	        boolean isEqual13 = Arrays.equals(arr1, arr3);

	        System.out.println("Are arr1 and arr2 equal? " + isEqual12); // true
	        System.out.println("Are arr1 and arr3 equal? " + isEqual13); // false (different order)
	    }
	}



