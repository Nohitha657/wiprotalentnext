package Java_fundamentals;

import java.util.Scanner;

public class Question29 {
	
		// TODO Auto-generated method stub
	    public static int[] withoutTen(int[] nums) {
	        int[] result = new int[nums.length];
	        int index = 0;

	        for (int num : nums) {
	            if (num != 10) {
	                result[index++] = num;
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        int[] input = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            input[i] = sc.nextInt();
	        }

	        int[] result = withoutTen(input);
	        System.out.print("Output: ");
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	

}
