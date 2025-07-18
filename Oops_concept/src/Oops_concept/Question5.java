package Oops_concept;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args){
        Employee employee1=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("salary that you are getting: ");
        int salary=sc.nextInt();
        System.out.println("year of join: ");
        int yearOfJoin=sc.nextInt();
        System.out.println("Insurance Number: ");
        String insuranceNumber=sc.nextLine();
        sc.nextLine();
        employee1.setname(name);
        employee1.setsalary(salary);
        employee1.setyear(yearOfJoin);
        employee1.setinsuranceNumber(insuranceNumber);
        employee1.display();
    }
}
class Person{
    private String name;
    
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    void display(){
        System.out.println("Name of the employee :"+getname());
    }
}
class Employee extends Person{
    private double salary;
    private int yearOfJoin;
    private String insuranceNumber;
    
    public void setsalary(double salary){
        this.salary=salary;
    }
    public void setyear(int yearOfJoin){
        this.yearOfJoin=yearOfJoin;
    }
    public void setinsuranceNumber(String insuranceNumber){
        this.insuranceNumber=insuranceNumber;
    }
    public double getsalary(){
        return salary;
    }
    public int getyear(){
        return yearOfJoin;
    }
    public String getinsuranceNumber(){
        return insuranceNumber;
    }
    void display(){
        super.display();
        System.out.println("salary is :"+salary);
        System.out.println("year of join :"+yearOfJoin);
        System.out.println("insurance number :"+insuranceNumber);
    }


}
