package Arrays;

public class FindIndex {
	
	    public static void main(String[] args) {
	        int[] arr = {5, 8, 12, 10, 3, 7};
	        int target = 10;
	        int index = -1;

	        // Linear Search Logic
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println("Element " + target + " found at index: " + index);
	        } else {
	            System.out.println("Element " + target + " not found in the array.");
	        }
	    }
	}


