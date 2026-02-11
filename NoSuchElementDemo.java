package ExceptionHandling;
import java.util.*;

public class NoSuchElementDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner("");
            sc.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("No such element handled");
        }
    }
}
