package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
	Set<String> empnames=new HashSet<>();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Question2 obj=new Question2();
		System.out.println("Enter no of Employees: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the names of employees: ");
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			obj.saveEmployeeName(name);
		}
		
		Set<String> all =obj.getAllEmployees();
		System.out.println("\nAll Employee Names:");
        for (String emp : all) {
            System.out.println(emp);
        }
	}
	
	public Set<String> saveEmployeeName(String name) {
		empnames.add(name);
		return empnames;
	}
	
	public Set<String> getAllEmployees() {
		return empnames;
	}
	

}
