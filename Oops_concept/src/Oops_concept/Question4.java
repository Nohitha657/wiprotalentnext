package Oops_concept;

public class Question4 {
	public static void main(String[] args){
        Animal animal=new Animal();
        System.out.println("Animal Object:");
        animal.eat();
        animal.sleep();
        Bird bird=new Bird();
        System.out.println("Bird Object:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
class Animal{
    public void eat(){
        System.out.println("eats food");
    }
    public void sleep(){
        System.out.println("sleeps well");
    } 
}
class Bird extends Animal{
    String fly;
    public void fly(){
        System.out.println("flys high");
    }
}



