package Oops_concept;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String txt=sc.nextLine();

		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
		    
		
		System.out.print(txt.substring(txt.length()-n));
		}


	}

}
