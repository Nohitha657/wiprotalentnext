package Java_fundamentals;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		// TODO Auto-generated method stub
		boolean isValid = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                isValid = false;
                break;
            }
        }

       
        if (isValid) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
		

	}

}
