package Static;
public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Reverse of 'hello': " + ReverseString.reverse("hello"));
    }
}