package List;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Employee details=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int empId=sc.nextInt();
		System.out.println("Enter Name: ");
		String empName=sc.next();
		System.out.println("Enter Email: ");
		String email=sc.next();
		System.out.println("Enter Gender: ");
		String gender=sc.next();
		System.out.println("Enter Salary: ");
		Float salary=sc.nextFloat();
		details.getEmplaoyeeDetails(empId,empName,email,gender,salary);
	}
	private void getEmplaoyeeDetails(int empId, String empName, String email, String gender, Float salary) {
		// TODO Auto-generated method stub
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(salary);
	}
}


