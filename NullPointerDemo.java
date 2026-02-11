package ExceptionHandling;
public class NullPointerDemo {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());  // causes NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer exception handled");
        }

    }
}
