package ExceptionHandling;
import java.util.*;

public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            for (Integer i : list) {
                list.add(2);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Concurrent modification handled");
        }
    }
}
