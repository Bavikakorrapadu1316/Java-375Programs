package ExceptionHandling;
import java.util.*;

public class MissingResourceDemo {
    public static void main(String[] args) {
        try {
            ResourceBundle.getBundle("test");
        } catch (MissingResourceException e) {
            System.out.println("Missing resource handled");
        }
    }
}
