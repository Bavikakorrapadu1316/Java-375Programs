package ExceptionHandling;
import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            br.readLine();
        } catch (IOException e) {
            System.out.println("IO exception handled");
        }
    }
}
