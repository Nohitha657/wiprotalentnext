package Java_fundamentals;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max1=arr[0];
		int max2=arr[0];
		int min1=arr[0];
		int min2=arr[0];
		for(int i=0;i<n;i++) {
			 if (arr[i] > max1) {
	                max2 = max1;
	                max1 = arr[i];
	            } else if (arr[i] > max2 && arr[i] != max1) {
	                max2 = arr[i];
	            }

	            
	            if (arr[i] < min1) {
	                min2 = min1;
	                min1 = arr[i];
	            } else if (arr[i] < min2 && arr[i] != min1) {
	                min2 = arr[i];
	            }
		}
		System.out.println("First largest number is: "+max1);
		System.out.println("Second largest number is: "+max2);
		System.out.println("First Smallest number is: "+min1);
		System.out.println("Second Smallest number is: "+min2);
		// TODO Auto-generated method stub

	}

}
