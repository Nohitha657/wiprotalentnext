package ExceptionHandling;

//User-defined Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class ValidatePerson {

 public static void main(String[] args) {
     try {
         // Check if both arguments are passed
         if (args.length != 2) {
             System.out.println("Please provide name and age as arguments.");
             return;
         }

         String name = args[0];
         int age = Integer.parseInt(args[1]);

         // Validate age
         if (age < 18 || age >= 60) {
             throw new InvalidAgeException("Age must be between 18 and 59.");
         }

         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Valid age. Registration successful.");

     } catch (NumberFormatException e) {
         System.out.println("Age must be a valid integer.");
     } catch (InvalidAgeException e) {
         System.out.println("Invalid Age: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("An unexpected error occurred: " + e.getMessage());
     }
 }
}

