package IO_Streams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializeEmployee {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("data");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Employee emp = (Employee) in.readObject();

            // Print employee properties
            System.out.println("Deserialized Employee:");
            System.out.println("Name     : " + emp.getname());
            System.out.println("Date   : " + emp.getdate());
            System.out.println("Department : " + emp.getdepartment());
            System.out.println("Designation : " + emp.getdesignation());
            System.out.println("Salary : " + emp.getsalary());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

