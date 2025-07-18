package Oops_concept;

import java.util.Scanner;

public class Question1 {
		// TODO Auto-generated method stub
	float length;
	float breadth;
    float height;
    
    public Question1(float length,float breadth,float height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public float volume(){
        return length * breadth * height;
    }
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	float length=sc.nextFloat();
    	float breadth=sc.nextFloat();
    	float height=sc.nextFloat();
    	Question1 vol=new Question1(4,5,6);
        float result=vol.volume();
        System.out.println(result);
    }
}

