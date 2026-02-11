package Arrays;

public class PositiveNumbers {
	
	    public static void main(String[] args) {
	        // Test array with positive and negative numbers
	        int[] arr = {-5, 10, 3, -2, 7, 0};

	        int sumPos = 0;
	        
	        // Enhanced for-loop (for-each)
	        for (int n : arr) {
	            if (n > 0) {
	                sumPos += n;
	            }
	        }

	        System.out.println("Sum of positive numbers: " + sumPos);
	    }
	}
