package Collections;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("One");
        q.add("Two");
        q.remove();

        for(String s : q) {
            System.out.println(s);
        }
    }
}
