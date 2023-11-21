import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time4 {
    public static void main(String[] args) {
        System.out.println("Date and Time formatter");


        LocalDateTime MyDateTime = LocalDateTime.now();
        System.out.println("Before formatting: "+MyDateTime);

        DateTimeFormatter MyDateTimeF = DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss");

        String datetime = MyDateTime.format(MyDateTimeF);
        System.out.println("After formatting: "+datetime);
    }
}
