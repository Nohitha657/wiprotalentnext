package LamdaFunctions;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        WordCount wc = (str) -> {
            if (str == null || str.isEmpty()) return 0;
            return str.trim().split("\\s+").length;
        };
        System.out.println("Enter the sentance: ");
        String testStr = sc.nextLine();
        int wordCount = wc.count(testStr);

        System.out.println("Input String: " + testStr);
        System.out.println("Word Count: " + wordCount);
    }
}
@FunctionalInterface
interface WordCount {
    int count(String str);
}

    

