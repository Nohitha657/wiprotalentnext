package Java_fundamentals;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if (Character.isLetter(ch)) {
	            System.out.println("It is an Alphabet.");
	        } else if (Character.isDigit(ch)) {
	            System.out.println("It is a Number.");
	        } else {
	            System.out.println("It is a Special Character.");
	        }

	}

}
