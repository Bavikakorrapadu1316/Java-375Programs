package ExceptionHandling;
public class NumberFormatDemo {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception handled");
        }
    }
}
