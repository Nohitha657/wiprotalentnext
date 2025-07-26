package IO_Streams;
import IO_Streams.Employee;
import java.io.*;
import java.util.Date;

public class SerializeEmployee {
    public static void main(String[] args) {
        String filename = "data";

        // Create an Employee object
        Employee emp = new Employee("John Doe", new Date(), "IT", "Developer", 75000.0);

        // --- Serialize ---
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(emp);
            System.out.println("Employee object serialized to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Deserialize ---
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Employee readEmp = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee details:");
            System.out.println("Name: " + readEmp.getname());
            System.out.println("Date: " + readEmp.getdate());
            System.out.println("Department: " + readEmp.getdepartment());
            System.out.println("Designation: " + readEmp.getdesignation());
            System.out.println("Salary: " + readEmp.getsalary());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
