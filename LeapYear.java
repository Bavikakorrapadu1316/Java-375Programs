package Operators;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2024;
		String res = (year % 400 == 0) ? "Leap Year" : (year % 100 == 0) ? "Not Leap Year" : (year % 4 == 0) ? "Leap Year" : "Not Leap Year";
		System.out.println(res);

	}

}
