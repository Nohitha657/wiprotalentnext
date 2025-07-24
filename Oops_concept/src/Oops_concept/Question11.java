package Oops_concept;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String txt=sc.nextLine();
		int n=txt.length();
	
		if(n%2==0){
		    
		    System.out.print(txt.substring(0,n/2));
		    
		
		}
		else{
		    System.out.println("null");
		}
		
	


		// TODO Auto-generated method stub

	}

}
