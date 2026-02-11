package Operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 5, n2 = 10, n3 = 7;
		int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		System.out.println("Max: " + max);


	}

}
