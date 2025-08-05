package Functional_Interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Question3 {
	static ArrayList<String> list=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of words to enter: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the words: ");
		for(int i=0;i<n;i++) {
			list.add(sc.nextLine());
		}
		
			Predicate<String> isPalindrome=word-> {
				String reversed =new StringBuilder(word).reverse().toString();
				return word.equalsIgnoreCase(reversed);
			};
			System.out.println("Pallindrome words: ");
			for(String word:list) {
				if(isPalindrome.test(word)) {
					System.out.println(word);
				}
			}
	}

}
