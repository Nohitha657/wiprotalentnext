package List;

import java.util.ArrayList;
import java.util.Iterator;

import List.Employee1;
public class EmployeeDB {
		
		ArrayList<Employee1> list=new ArrayList<>();
		public boolean addEmployee1(Employee1 e) {
	        return list.add(e);
	    }
		
		public boolean deleteEmployee1(int empId) {
	        Iterator<Employee1> it = list.iterator();
	        while (it.hasNext()) {
	            Employee1 e = it.next();
	            if (e.empId == empId) {
	                it.remove();
	                return true;
	            }
	        }
	        return false;
	    }

		public String showPaySlip(int empId) {
	        for (Employee1 e : list) {
	            if (e.empId == empId) {
	                return "PaySlip for Employee ID: " + empId + ", Name: " + e.name + ", Amount: ₹50000";
	            }
	        }
	        return "Employee not found.";
	    }
	
public static void main(String[] args) {
	
	 EmployeeDB db = new EmployeeDB();

       Employee1 e1 = new Employee1(101, "Alice");
       Employee1 e2 = new Employee1(102, "Bob");
       Employee1 e3 = new Employee1(103, "Charlie");

       db.addEmployee1(e1);
       db.addEmployee1(e2);
       db.addEmployee1(e3);

       System.out.println(db.showPaySlip(102));
       db.deleteEmployee1(102);
       System.out.println(db.showPaySlip(102));
   }
}


