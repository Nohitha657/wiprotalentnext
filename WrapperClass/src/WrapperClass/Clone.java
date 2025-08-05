package WrapperClass;

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
