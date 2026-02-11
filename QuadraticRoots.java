package Introduction;
import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, and c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("Root 1 = %.2f and Root 2 = %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            double root1 = -b / (2 * a);
            System.out.format("Root 1 and Root 2 are equal to %.2f%n", root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("Root 1 = %.2f+%.2fi and Root 2 = %.2f-%.2fi%n", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
