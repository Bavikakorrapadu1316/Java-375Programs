package Operators;

public class Herons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3, b = 4, c = 5;
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area: " + area);


	}

}
