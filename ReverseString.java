package Introduction;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();
        scanner.close();
        
        StringBuilder reversed = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }
        System.out.println("Reversed string: " + reversed.toString());
    }
}
