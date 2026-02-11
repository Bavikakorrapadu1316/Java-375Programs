package Introduction;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent (positive integer): ");
        int exponent = scanner.nextInt();
        scanner.close();

        long result = 1;
        
        for (; exponent != 0; --exponent) {
            result *= base;
        }

        System.out.println("Answer = " + result);
    }
}
