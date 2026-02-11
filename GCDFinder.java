package Introduction;
import java.util.Scanner;

public class GCDFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        scanner.close();

        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            // Checks if i is factor of both numbers
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}
