package StreamAPI;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	int rollNo;
	String name;
	int mark;
	
	Student(int rollNo,String name,int mark){
		this.rollNo=rollNo;
		this.name=name;
		this.mark=mark;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list1=new ArrayList<>();
		ArrayList<Student> list2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Students present: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the RollNo: ");
			int empno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name: ");
			String name=sc.nextLine();
			System.out.println("Enter the mark: ");
			int age=sc.nextInt();
			
			
			list1.add(new Student(empno,name,age));
		}
			
			System.out.println("Students having morethan 50:");
	        for (Student emp : list1) {
	        	if (emp.mark>50) { 
	                list2.add(emp);
	            }
	        }
	        System.out.println(list2.size());
	}
		

}
