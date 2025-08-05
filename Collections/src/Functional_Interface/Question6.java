package Functional_Interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Question6 {
	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			words.add(sc.nextLine());
		}
		Consumer<ArrayList<String>> reverseConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };
        reverseConsumer.accept(words);
        System.out.println("Reversed words: " + words);
		
	}

}
