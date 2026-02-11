package Arrays;
import java.util.*;

public class InteractionArray {
    public static void main(String[] args) {
        // Create two sets with some overlapping values
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 3, 4));

        // retainAll() modifies s1 to only keep elements also present in s2
        s1.retainAll(s2);

        // Output the result: [2, 3]
        System.out.println("Intersection: " + s1);
    }
}

