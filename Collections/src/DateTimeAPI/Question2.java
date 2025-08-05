package DateTimeAPI;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Question2{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayNextMonth = today.plusMonths(1).withDayOfMonth(1);

        int sundayCount = 0;
        LocalDate date = firstDayNextMonth;

        while (sundayCount < 2) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
            }
            if (sundayCount < 2) {
                date = date.plusDays(1);
            }
        }

        System.out.println("Second Sunday of next month: " + date);
    }
}

