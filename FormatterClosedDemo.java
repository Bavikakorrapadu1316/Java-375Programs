package ExceptionHandling;
import java.util.*;

public class FormatterClosedDemo {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter();
            f.close();
            f.format("Hello");
        } catch (FormatterClosedException e) {
            System.out.println("Formatter closed handled");
        }
    }
}
