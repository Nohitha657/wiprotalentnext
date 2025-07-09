package Java_fundamentals;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

     
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
		System.out.println(max);
		
		
		System.out.println(min);
		// TODO Auto-generated method stub

	}

}
