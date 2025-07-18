package Oops_concept;

import java.util.Scanner;

public class Question2 {

	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int num1=sc.nextInt();
	        int num2=sc.nextInt();
	        int result1=powerInt(num1,num2);
	        double result2=powerDouble(num1,num2);
	        System.out.println(result1);
	        System.out.println(result2);
	        
	    }
	    public static double powerDouble(double num1,int num2){
	        return Math.pow(num1,num2);
	    }
	    public static int powerInt(int num1,int num2){
	        return (int)Math.pow(num1,num2);
	    }
	    
	}



