package Arrays;

public class Largsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 20, 8};
		int max = arr[0], min = arr[0];
		for (int num : arr) {
		    if (num > max) max = num;
		    if (num < min) min = num;
		}
		System.out.println("Max: " + max + ", Min: " + min);


	}

}
