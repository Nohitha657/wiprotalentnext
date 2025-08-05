package Functional_Interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Question5 {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n=sc.nextInt();
		for (int i = 0; i < 10; i++) {
            nums.add(sc.nextInt());
        }
		for(int i=0;i<n;i++) {
		Predicate<Integer> isPerfectSquare = num -> {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        System.out.println("Perfect square numbers:");
        for (int num : nums) {
            if (isPerfectSquare.test(num)) {
                System.out.println(num);
            }
        }
	}

	}
}
