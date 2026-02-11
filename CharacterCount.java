package Introduction;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to count: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("The character '" + ch + "' appears " + count + " times.");
    }
}
