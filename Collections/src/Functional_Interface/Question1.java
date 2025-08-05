package Functional_Interface;

import java.util.ArrayList;
import java.util.Scanner;



public class Question1 {
	int id;
	String name;
	String location;
	int salary;
	public Question1(int id, String name, String location, int salary) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.location=location;
		this.salary=salary;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Question1> employee=new ArrayList<>();
		ArrayList<String> list=new ArrayList<>();
		System.out.println("Enter no of employees: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {;
			System.out.println("Enter the id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the name: ");
			String name=sc.nextLine();
			System.out.println("enter the location: ");
			String location=sc.nextLine();
			System.out.println("Enter the salary: ");
			int salary=sc.nextInt();
			employee.add(new Question1(id,name,location,salary));
		}
	
		for(Question1 emp:employee) {
			list.add(emp.location);
		}
		System.out.println("\nLocations of all employees:");
        for (String loc : list) {
            System.out.println(loc);
        }
 	
	}
}
