package Collections;
import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("X");
        v.add("Y");
        v.remove("Y");

        for(String s : v) {
            System.out.println(s);
        }
    }
}
