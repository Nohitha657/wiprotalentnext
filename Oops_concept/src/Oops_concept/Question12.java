package Oops_concept;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String txt=sc.nextLine();
		StringBuilder result=new StringBuilder();
		int n=txt.length();
		
		for(int i=0;i<n;i++){
		    char ch=txt.charAt(i);
		    if(i!=0 && i!=n-1){
		        result.append(ch);
		    }
		}
		System.out.println(result);


	}

}
