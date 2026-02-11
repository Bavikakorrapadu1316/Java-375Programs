package Collections;
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(3,"Three");
        map.put(1,"One");

        System.out.println(map);
    }
}
