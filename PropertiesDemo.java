package Collections;
import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("user","admin");

        System.out.println(p.getProperty("user"));
    }
}
