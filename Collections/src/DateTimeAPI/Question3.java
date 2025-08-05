package DateTimeAPI;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your joining date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate joiningDate = LocalDate.parse(input);
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience: " + experience.getYears() + " years, " +
                experience.getMonths() + " months, " + experience.getDays() + " days.");
    }
}

