package ExceptionHandling;

public class MathOperation {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        double average = 0;

        try {
            if (args.length < 5) {
                throw new IllegalArgumentException("Please provide exactly 5 integers as command line arguments.");
            }

            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]); // may throw NumberFormatException
                sum += numbers[i];
            }

            average = (double) sum / numbers.length; // may throw ArithmeticException

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

