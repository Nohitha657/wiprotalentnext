package WrapperClass;

public class Question2 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide an integer number as a command line argument.");
            return;
        }

        try {
            
            int number = Integer.parseInt(args[0]);

           
            System.out.println("Given number: " + number);
            System.out.println("Binary: " + Integer.toBinaryString(number));
            System.out.println("Octal: " + Integer.toOctalString(number));
            System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer number.");
        }
    }
}
