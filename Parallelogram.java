package Overloading;
import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double area = base * height;
        System.out.println("Area: " + area);
        scanner.close();
    }
}