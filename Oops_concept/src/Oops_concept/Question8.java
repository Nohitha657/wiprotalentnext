package Oops_concept;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String rever=new StringBuilder(a).reverse().toString();
	if(a.equals(rever)) {
		System.out.println("is Pallindrome");
	}else {
		System.out.println("Not a Pallindrome");
	}
	
	}

}
