package ExceptionHandling;
import java.util.regex.*;

public class PatternSyntaxDemo {
    public static void main(String[] args) {
        try {
            Pattern.compile("[abc");
        } catch (PatternSyntaxException e) {
            System.out.println("Pattern syntax handled");
        }
    }
}
