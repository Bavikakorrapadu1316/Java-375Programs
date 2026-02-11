package Collections;
import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(101,"A");
        map.put(102,"B");

        System.out.println(map);
    }
}
