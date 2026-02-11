package Collections;
import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"One");
        ht.put(2,"Two");

        System.out.println(ht.get(1));
    }
}
