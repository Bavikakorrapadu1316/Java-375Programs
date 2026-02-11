package Collections;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(10);
        set.add(30);
        set.remove(10);

        for(int i : set) {
            System.out.println(i);
        }
    }
}
