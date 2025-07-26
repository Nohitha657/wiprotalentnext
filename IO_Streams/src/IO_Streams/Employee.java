package IO_Streams;
import java.util.Date;

public class Employee extends SerializeEmployee {
    static final long serialVersionUID = 1L;
	String name;
	Date date;
	String department;
	String designation;
	double salary;


	public Employee(){}
	
	
	public Employee(String name,Date date,String department,String designation,double salary) {
		this.name=name;
		this.date=date;
		this.department=department;
		this.designation=designation;
		this.salary=salary;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public void setdate(Date date) {
		this.date=date;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	public void setdesignation(String designation) {
		this.designation=designation;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public String getname()
	{
		return name;
	}
	public Date getdate()
	{
		return date;
	}
	public String getdepartment()
	{
		return department;
	}
	public String getdesignation()
	{
		return designation;
	}
	public double getsalary()
	{
		return salary;
	}
	
}


	

