package Java_fundamentals;



import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Gender (Male/Female):");
        String gender = sc.nextLine();

        System.out.println("Enter your Age:");
        int age = sc.nextInt();

        if (gender.equalsIgnoreCase("Female") && age >= 1 && age <= 58) {
            System.out.println("The percentage of Interest is 8.2%");
        } else if (gender.equalsIgnoreCase("Female") && age >= 59 && age <= 100) {
            System.out.println("The percentage of Interest is 9.2%");
        } else if (gender.equalsIgnoreCase("Male") && age >= 1 && age <= 58) {
            System.out.println("The percentage of Interest is 8.4%");
        } else if (gender.equalsIgnoreCase("Male") && age >= 59 && age <= 100) {
            System.out.println("The percentage of Interest is 10.5%");
        } else {
            System.out.println("Please enter valid gender and age.");
        }

        sc.close();
    }
}

