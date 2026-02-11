package Arrays;
import java.util.*;
public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {1, 2, 2, 3, 4, 4,5,6,7,6,8,8,9,0};
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println("Unique: " + set);


	}

}
