package Oops_concept;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Taking input for S1 and S2
        System.out.print("Enter cities for S1 separated by hyphen (-): ");
        String input1 = sc.nextLine();
        System.out.print("Enter cities for S2 separated by hyphen (-): ");
        String input2 = sc.nextLine();

        // Create Sets to store cities (preserves order)
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(input1.split("-")));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(input2.split("-")));

        // S1 matched to S2
        StringJoiner matched1 = new StringJoiner("-");
        for (String city : set1) {
            if (set2.contains(city)) {
                matched1.add(city);
            }
        }

        // S2 matched to S1
        StringJoiner matched2 = new StringJoiner("-");
        for (String city : set2) {
            if (set1.contains(city)) {
                matched2.add(city);
            }
        }

        // Output
        System.out.println("S1 matched to S2: " + matched1);
        System.out.println("S2 matched to S1: " + matched2);

	}

}
