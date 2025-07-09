package Java_fundamentals;

import java.util.Scanner;

public class Question21 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	int sum=0;
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];
	}
	int avg=sum/n;
	System.out.println(sum);
	System.out.print(avg);
	
}

}
