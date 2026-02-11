package Introduction;
import java.util.Scanner;

public class FactorialIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
        } else {
            for (int i = 1; i <= number; ++i) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }
}
