package Operators;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 29; boolean isPrime = num > 1;
		for (int i = 2; i <= Math.sqrt(num); i++) {
		    if (num % i == 0) { isPrime = false; break; }
		}
		System.out.println(isPrime ? "Prime" : "Not Prime");


	}

}
