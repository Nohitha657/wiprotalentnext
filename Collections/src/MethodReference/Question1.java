package MethodReference;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Question1 ans=new Question1();
		int n=sc.nextInt();
		
		IntFunction<Integer> ref = ans::factorial;
		int fact=ref.apply(n);
		System.out.println(fact);
	}
	
	public int factorial(int n) {
		 int result=1;
		for(int i=n;i>0;i--) {
		result=result*i;
		}
		return result;
		
	}

}
