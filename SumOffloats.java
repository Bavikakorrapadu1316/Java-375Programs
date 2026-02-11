package Overloading;
import java.util.Scanner;

public class SumOffloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second float: ");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
