package MethodReference;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Question3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Using method reference
        IntPredicate check = Question3::isPrime;
        boolean result = check.test(n);

        if (result)
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is NOT a Prime Number.");
    }

    // Static method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
