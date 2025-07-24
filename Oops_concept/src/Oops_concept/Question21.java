package Oops_concept;

import java.util.Optional;
import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter address (press Enter to simulate null): ");
        String input = sc.nextLine();

       
        String address = input.isEmpty() ? null : input;

       
        String finalAddress = Optional.ofNullable(address).orElse("India");

        System.out.println("Address: " + finalAddress);

	}

}
