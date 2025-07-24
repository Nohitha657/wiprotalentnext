package Oops_concept;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine().toLowerCase(); 
        String[] parts = input.split(",");

        String first = parts[0];
        String second = parts[1];

       
        if (first.charAt(first.length() - 1) == second.charAt(0)) {
            second = second.substring(1);  
        }

        String result = first + second;
        System.out.println(result); 
	}
}
