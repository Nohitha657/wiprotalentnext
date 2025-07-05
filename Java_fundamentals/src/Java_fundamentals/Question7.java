package Java_fundamentals;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().toLowerCase().charAt(0);
		char ch2=sc.next().toLowerCase().charAt(0);
		if(ch1>ch2) {
			System.out.print(ch2 +" , "+ch1);
		}else {
			System.out.print(ch1 +" , "+ch2);
		}
		// TODO Auto-generated method stub

	}

}
