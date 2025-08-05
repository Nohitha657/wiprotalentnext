package Functional_Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
	static ArrayList<Integer> list=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of number: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		int result=sum();
		System.out.println(result);
		
	}
	public static int sum() {
		int sum=0;
		for(int num:list) {
			sum+=num;
		}
		return sum;
		
	}

}
