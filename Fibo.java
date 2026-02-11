package Operators;
public class Fibo{

    // Move the method HERE (outside of main, but inside class)
    public static int fib(int n) {
        // Base case: if n is 0 or 1, return n
        if (n <= 1) {
            return n;
        }
        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
