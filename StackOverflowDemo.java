package ExceptionHandling;
public class StackOverflowDemo {
    static void show() {
        show();
    }
    public static void main(String[] args) {
        try {
            show();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow handled");
        }
    }
}
