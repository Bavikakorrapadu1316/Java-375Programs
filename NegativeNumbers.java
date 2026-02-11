package Arrays;

public class NegativeNumbers {
	
	    public static void main(String[] args) {
	        // Sample array with mixed values
	        int[] arr = {-10, 5, -2, 0, -3, 8};

	        int sumNeg = 0;
	        
	        // Iterating through the array
	        for (int n : arr) {
	            if (n < 0) {
	                sumNeg += n;
	            }
	        }

	        System.out.println("Sum of negative numbers: " + sumNeg);
	    }
	}
