package Functional_Interface;
import java.util.*;
import java.util.function.Supplier;
public class Question8 {
    public static void main(String[] args) {
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;
            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }
            return primes;
        };

        ArrayList<Integer> primes = primeSupplier.get();
        System.out.println("First 10 prime numbers: " + primes);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

