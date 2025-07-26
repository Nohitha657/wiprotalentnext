package WrapperClass;
class CloneDemo implements Cloneable {
    int id;
    String name;
    String department;

    // Constructor
    CloneDemo(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Overriding the clone method
    public CloneDemo clone() {
        try {
            return (CloneDemo) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // toString method to print properties
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class Clone {
    public static void main(String[] args) {
        // Create original object
        CloneDemo emp1 = new CloneDemo(101, "Alice", "HR");

        // Clone the object
        CloneDemo empClone = emp1.clone();

        // Modify the original object's properties
        emp1.name = "Bob";
        emp1.department = "Finance";

        // Print both objects
        System.out.println("Original Employee: " + emp1);
        System.out.println("Cloned Employee  : " + empClone);
    }
}


