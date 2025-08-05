package MethodReference;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Question2 ans=new Question2();
		int n=sc.nextInt();
		
		IntFunction<Integer> ref = ans::digitCount;
		int count=ref.apply(n);
		System.out.println(count);
	}
	
	public int digitCount(int n) {
		 int count=0;
		 if(n==0) return 1;
		 while(n!=0) {
			 count++;
			 n/=10;
		 }
		
		return count;
		
	}

}


