package Introduction;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int originalNumber = number;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of digits of " + originalNumber + " is: " + sum);
    }
}
