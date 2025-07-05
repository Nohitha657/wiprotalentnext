package Java_fundamentals;

import java.util.Scanner;

public class Question4b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n>0 && m>0) {
			 n=n%10;
			 m=m%10;
			if(n==m) {
				System.out.print(true);
			}else {
				System.out.print(false);
			}
		}

		// TODO Auto-generated method stub

	}

}
