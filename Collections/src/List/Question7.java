package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import List.Employee1;


public class Question7 {
    public static void main(String[] args) {
        Vector<Employee1> empVector = new Vector<>();

        // Add employee objects
        empVector.add(new Employee1(101, "Alice"));
        empVector.add(new Employee1(102, "Bob"));
        empVector.add(new Employee1(103, "Charlie"));

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Employee1> iterator = empVector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee1> enumeration = empVector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}


