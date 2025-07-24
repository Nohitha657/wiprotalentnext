package Oops_concept;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String txt=sc.nextLine();
		StringBuilder result =new StringBuilder();
		
		for (int i = 0; i < txt.length(); i++) {
		    char current = txt.charAt(i);
		
		    if (current == '*') continue;
		    if (i > 0 && txt.charAt(i - 1) == '*') continue;
		    if (i < txt.length() - 1 && txt.charAt(i + 1) == '*') continue;
		
		    result.append(current);
		}
		System.out.println(result);


	}

}
