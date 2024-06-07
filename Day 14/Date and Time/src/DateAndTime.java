import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTime {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        String s = "1995-04-13";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate1 = LocalDate.parse(s);
        String s1 = localDate1.format(dateTimeFormatter);
        System.out.println(s1);
        LocalDate yesterday = localDate.minusDays(1);
        LocalDate tommorow = localDate.plusDays(1);
        System.out.println(yesterday + " " + tommorow);
    }
}