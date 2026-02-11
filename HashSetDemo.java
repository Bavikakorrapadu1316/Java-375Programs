package Collections;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.remove("Green");

        for(String s : set) {
            System.out.println(s);
        }
    }
}
