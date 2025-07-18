package Oops_concept;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int n=str.length();
	    String a=str.substring(0,2);
	    for(int i=0;i<n;i++){
	        System.out.print(a);
	    }

	}


}
