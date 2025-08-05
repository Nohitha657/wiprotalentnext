package Functional_Interface;

import java.util.*;
import java.util.function.Consumer;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++) {
        	numbers.add(sc.nextInt());
        }
        Consumer<Integer> oddEvenConsumer = num -> {
            String result = num + " " + (num % 2 == 0 ? "even" : "odd");
            System.out.println(result);
        };

        numbers.forEach(oddEvenConsumer);
    }
}


