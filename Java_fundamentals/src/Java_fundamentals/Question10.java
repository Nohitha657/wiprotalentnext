package Java_fundamentals;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet character: ");
        char ch = sc.next().charAt(0); // Read first character of input

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Not a valid alphabet character.");
        }
		
		// TODO Auto-generated method stub
	}

}
