package Collections;
import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.add("A");
        dq.addFirst("B");
        dq.removeLast();

        for(String s : dq) {
            System.out.println(s);
        }
    }
}
