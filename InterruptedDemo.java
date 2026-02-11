package ExceptionHandling;
public class InterruptedDemo {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception handled");
        }
    }
}
