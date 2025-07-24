package Oops_concept;


import java.util.Scanner;
import java.util.StringJoiner;

public class Question18 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		
		StringJoiner newString=new StringJoiner(",","{","}");
		newString.add(a);
		newString.add(b);
		newString.add(c);
		System.out.println(newString.toString());
		
		// TODO Auto-generated method stub

	}

}
