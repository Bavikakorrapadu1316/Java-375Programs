package Static;


	public class CelciusToFaherenheit {
	    public static double convert(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	    public static void main(String[] args) {
	        System.out.println("30°C in Fahrenheit: " + CelciusToFaherenheit.convert(30));
	    }
	}


