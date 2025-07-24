package Oops_concept;

import java.util.Optional;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = null;  

        try {
         
            Optional<Employee> optionalEmployee = Optional.ofNullable(employee);

           
            Employee validEmployee = optionalEmployee.orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));

       
            validEmployee.withdraw(500);  

        } 
            catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());  
        }

	
        }
	
}
