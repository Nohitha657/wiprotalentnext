package Oops_concept;

import java.util.Optional;

public class Question20 {

	public static void main(String[] args) {
		 String names[] = new String[5]; 
	        Optional<String> optionalName = Optional.ofNullable(names[0]);

	        
	        optionalName.ifPresentOrElse(
	            name -> System.out.println("Length: " + name.length()),
	            () -> System.out.println("Name at index 0 is null")
	        );
		// TODO Auto-generated method stub

	}

}
