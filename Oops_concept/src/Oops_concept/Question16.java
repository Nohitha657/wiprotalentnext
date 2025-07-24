package Oops_concept;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        }

        if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        System.out.println(result.toString());

	}

}
