package WrapperClass;
import WrapperClass.Clone;
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




