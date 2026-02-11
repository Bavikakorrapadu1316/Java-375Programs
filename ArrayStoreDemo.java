package ExceptionHandling;
public class ArrayStoreDemo {
    public static void main(String[] args) {
        try {
            Object[] a = new Integer[3];
            a[0] = "Hello";
        } catch (ArrayStoreException e) {
            System.out.println("Array store exception handled");
        }
    }
}
