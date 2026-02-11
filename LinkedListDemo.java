package Collections;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeFirst();

        for(int i : list) {
            System.out.println(i);
        }
    }
}
