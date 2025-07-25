package ExceptionHandling;


//User-defined Exception Class
class InvalidCountryException extends Exception {
 public InvalidCountryException(String message) {
     super(message);
 }
}

//Main class
public class UserRegistration {

 // Registration method
 public static void registerUser(String username, String userCountry) throws InvalidCountryException {
     if (!userCountry.equalsIgnoreCase("India")) {
         throw new InvalidCountryException("User Outside India cannot be registered");
     } else {
         System.out.println("User registration done successfully");
     }
 }

 public static void main(String[] args) {
     // Example 1: User from US
     try {
         registerUser("Mickey", "US");
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }

     // Example 2: User from India
     try {
         registerUser("Mini", "India");
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }
 }
}
