package Strings;
public class VowelConsonentCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0, consonants = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
            else if (c >= 'a' && c <= 'z') consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
