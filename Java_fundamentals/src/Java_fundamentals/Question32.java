package Java_fundamentals;
import java.util.Scanner;

class Question32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 elements for array A:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 3 elements for array B:");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        int[] result = middleWay(a, b);
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}
