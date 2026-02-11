package Arrays;

public class Product {
	
	    public static void main(String[] args) {
	        // Sample array
	        int[] arr = {1, 2, 3, 4, 5};

	        // Initialize product to 1 (Multiplying by 0 would ruin the result)
	        long prod = 1;

	        for (int n : arr) {
	            prod *= n;
	        }

	        System.out.println("Product of all elements: " + prod);
	    }
	}
