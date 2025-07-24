package Java_fundamentals;

import java.util.Scanner;

public class Question28 {
    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
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

        int[] result = evenOdd(input);
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

