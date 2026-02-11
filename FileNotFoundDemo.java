package ExceptionHandling;
import java.io.*;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found handled");
        }
    }
}
