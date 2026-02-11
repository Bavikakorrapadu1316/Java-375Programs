package ExceptionHandling;
import java.time.*;
import java.time.format.*;

public class DateTimeParseDemo {
    public static void main(String[] args) {
        try {
            LocalDate.parse("abc");
        } catch (DateTimeParseException e) {
            System.out.println("Date time parse handled");
        }
    }
}
