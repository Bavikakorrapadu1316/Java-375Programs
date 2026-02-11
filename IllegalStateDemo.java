package ExceptionHandling;
import java.util.*;

public class IllegalStateDemo {
    public static void main(String[] args) {
        try {
            Iterator<Integer> it = new ArrayList<Integer>().iterator();
            it.remove();
        } catch (IllegalStateException e) {
            System.out.println("Illegal state handled");
        }
    }
}
