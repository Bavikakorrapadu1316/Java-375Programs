package Introduction;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();

        long binary = 0;
        int remainder, i = 1;

        while (decimal != 0) {
            remainder = decimal % 2;
            decimal /= 2;
            binary += remainder * i;
            i *= 10;
        }
        System.out.println("Binary representation: " + binary);
    }
}
