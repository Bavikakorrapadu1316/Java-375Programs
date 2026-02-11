package Operators;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153, temp = n, sum = 0;
		int digits = String.valueOf(n).length();
		while (temp != 0) {
		    sum += Math.pow(temp % 10, digits);
		    temp /= 10;
		}
		System.out.println(sum == n ? "Armstrong" : "Not Armstrong");


	}

}
