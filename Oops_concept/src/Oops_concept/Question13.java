package Oops_concept;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String txt=sc.nextLine();
		String txt2=sc.nextLine();
		
		int n1=txt.length();
		int n2=txt2.length();
		if(n1<n2){
		    System.out.println(txt+txt2+txt);
		}
		else{
		    System.out.println(txt2+txt+txt2);
		}

		// TODO Auto-generated method stub

	}

}
