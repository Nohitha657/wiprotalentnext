package Java_fundamentals;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n-1;i++) {
	    	 boolean isDuplicate = false;
	    	 for (int j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If not a duplicate, print it
	            if (!isDuplicate) {
	                System.out.print(arr[i] + " ");
	            }
	    	
	    }
	    
		// TODO Auto-generated method stub

	}

}
