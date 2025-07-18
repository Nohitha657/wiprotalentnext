package Oops_concept;

import java.util.Scanner;

public class Question6 {
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        Apple apple=new Apple("Apple","sweet",5);
	        Orange orange=new Orange("Orange","sour",6);
	        apple.eat();
	        orange.eat();
	    }
	}
	class Fruit{
	    String name;
	    String taste;
	    int size;
	    
	    Fruit(String name, String taste, int size) {
	        this.name = name;
	        this.taste = taste;
	        this.size = size;
	    }
	    public void eat(){
	        System.out.println("Fruit is so tasty ");
	    }
	}
	class Apple extends Fruit{
	    Apple(String name, String taste, int size) {
	        super(name, taste, size);
	    }
	    @Override 
	    public void eat(){
	        System.out.println(name+" is so "+taste);
	    }
	}
	class Orange extends Fruit{
	    Orange(String name, String taste, int size) {
	        super(name, taste, size);
	    }
	    @Override 
	    public void eat(){
	        System.out.println(name+" is so "+taste);
	    }


}
