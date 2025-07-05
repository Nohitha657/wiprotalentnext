package Java_fundamentals;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			for(int i=0;i<num;i++) {
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
		}
		System.out.print(sum);
		// TODO Auto-generated method stub

		

	}

}
