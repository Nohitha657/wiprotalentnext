package StreamAPI;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	int empno;
	String name;
	int age;
	String location;
	
	Employee(int empno,String name,int age,String location){
		this.empno=empno;
		this.name=name;
		this.age=age;
		this.location=location;
	}
	public static void main(String[] args) {
		ArrayList<Employee> list1=new ArrayList<>(5);
		ArrayList<Employee> list2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the emp no: ");
			int empno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name: ");
			String name=sc.nextLine();
			System.out.println("Enter the age: ");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the location: ");
			String location=sc.nextLine();
			
			
			list1.add(new Employee(empno,name,age,location));
		
		System.out.println("Employees having pune as location:");
        for (Employee emp : list1) {
        	if (emp.location.equalsIgnoreCase("pune")) { 
                list2.add(emp);
            }
        }
        for (Employee e : list2) {
            System.out.println(e); 
        }       
	}
}
