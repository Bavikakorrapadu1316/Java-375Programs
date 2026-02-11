package ExceptionHandling;
public class ClassNotFoundDemo {
    public static void main(String[] args) {
        try {
            Class.forName("Test");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found handled");
        }
    }
}
