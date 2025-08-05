package LamdaFunctions;
import java.util.*;
import java.util.stream.*;

public class Question1{
//    private static final String PrimeFilter = null;

	public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();

        // Add 25 random numbers
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100)); // numbers between 0 to 99
        }

        System.out.println("All Numbers: " + al);

        // Print prime numbers using lambda
        System.out.println("Prime Numbers:");
        al.stream()
          .filter(Question1::isPrime)
          .forEach(System.out::println);
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
