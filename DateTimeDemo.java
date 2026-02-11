package ExceptionHandling;
import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        try {
            LocalDate.of(2024, 13, 10);
        } catch (DateTimeException e) {
            System.out.println("Date time exception handled");
        }
    }
}
