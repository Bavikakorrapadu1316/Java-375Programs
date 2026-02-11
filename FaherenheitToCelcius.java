package Static;

public class FaherenheitToCelcius {
	
	    public static double convert(double fahrenheit) {
	        return (fahrenheit - 32) * 5 / 9;
	    }

	    public static void main(String[] args) {
	        System.out.println("86°F in Celsius: " + FaherenheitToCelcius.convert(86));
	    }
	}

