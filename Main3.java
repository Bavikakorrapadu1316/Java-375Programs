package Operators;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
       Scanner sc3 = new Scanner(System.in);{
        System.out.print("Enter two numbers: ");
        double a = sc3.nextDouble(), b = sc3.nextDouble();
        System.out.println("Sum: " + (a + b) + "\nDiff: " + (a - b) + "\nProd: " + (a * b) + "\nDiv: " + (b != 0 ? (a / b) : "Undefined"));
    }
}
}
