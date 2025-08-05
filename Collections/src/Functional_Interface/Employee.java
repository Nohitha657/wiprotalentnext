package Functional_Interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public float getsalary() {
		return salary;
	}
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of employees: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the salary:");
		float salary=sc.nextFloat();
		
		list.add(new Employee(id,name,salary));
		}
		Predicate<Employee> isLowSalary = emp-> emp.getsalary()<10000;
			
		System.out.println("\nEmployees with salary < 10000:");
		for (Employee emp : list) {
			if (isLowSalary.test(emp)) {
				System.out.println("ID: " + emp.getid() + ", Name: " + emp.getname() + ", Salary: " + emp.getsalary());
			}
		}
		
	

	}
}
