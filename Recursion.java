package Operators;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234, sum = 0;
		while (n != 0) {
		    sum += n % 10;
		    n /= 10;
		}
		System.out.println("Sum: " + sum);


	}

}
