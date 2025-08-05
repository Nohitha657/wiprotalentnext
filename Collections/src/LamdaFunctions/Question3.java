package LamdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Question3 {
	    public static void main(String[] args) {
	        ArrayList<String> al = new ArrayList<>(Arrays.asList(
	            "lion", "tiger", "deer", "bear", "zebra",
	            "rhino", "wolf", "eagle", "fox", "owl"
	        ));

	        System.out.println("Strings with Odd Length:");
	        al.stream()
	          .filter(str -> str.length() % 2 != 0)
	          .forEach(System.out::println);
	    }
	}

