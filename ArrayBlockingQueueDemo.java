package Collections;
import java.util.concurrent.*;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(5);
        q.add(10);
        q.add(20);
        q.remove();

        for(int i : q) {
            System.out.println(i);
        }
    }
}
