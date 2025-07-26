package List;

class Employee1 {
    int empId;
    String name;

    Employee1(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String toString() {
        return "Employee[ID=" + empId + ", Name=" + name + "]";
    }
}