package Introduction;
import java.util.Scanner;

public class CiricleProps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);
    }
}

