package Collections;
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Book");
        stack.push("Pen");
        stack.pop();

        for(String s : stack) {
            System.out.println(s);
        }
    }
}
