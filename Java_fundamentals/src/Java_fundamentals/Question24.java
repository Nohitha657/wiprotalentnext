package Java_fundamentals;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        System.out.print("The Characters are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Character.toString(arr[i]) + " ");
        }

	}

}
