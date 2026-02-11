package ExceptionHandling;
public class NegativeArraySizeDemo {
    public static void main(String[] args) {
        try {
            int[] a = new int[-3];
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array size handled");
        }
    }
}
