package ExceptionHandling;


class ArithmeticDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;   // this line causes ArithmeticException
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero handled");
        }
    }
}
