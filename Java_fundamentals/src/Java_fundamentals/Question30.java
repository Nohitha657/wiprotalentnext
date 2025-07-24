package Java_fundamentals;

import java.util.Scanner;

public class Question30 {
	    public static int sumWithSkip(int[] arr) {
	        int sum = 0;
	        boolean skip = false;

	        for (int num : arr) {
	            if (num == 6) {
	                skip = true;
	            } else if (num == 7 && skip) {
	                skip = false;
	            } else if (!skip) {
	                sum += num;
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter number of elements:");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int result = sumWithSkip(arr);
	        System.out.println("Sum: " + result);
	        
	        sc.close();
	    }
	}

