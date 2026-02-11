package Arrays;

	import java.util.Arrays;

	public class CopyToArray {
	    public static void main(String[] args) {
	        // 1. Initialize original array
	        int[] original = {1, 2, 3};

	        // 2. Create a new array of the same length
	        int[] copy = new int[original.length];

	        // 3. Perform the copy
	        // Parameters: (Source, SourcePos, Dest, DestPos, Length)
	        System.arraycopy(original, 0, copy, 0, original.length);

	        // 4. Print results to verify
	        System.out.println("Original: " + Arrays.toString(original));
	        System.out.println("Copy: " + Arrays.toString(copy));
	    }
	}

