package com.automobile.FourWheeler;

public class test {

	public static void main(String[] args) {
		Logan logan=new Logan();
		System.out.println("Logan Model: " + logan.getModelName());
        System.out.println("Logan Reg. No: " + logan.getRegistrationNumber());
        System.out.println("Logan Owner: " + logan.getOwnerName());
        System.out.println("Logan Speed: " + logan.getspeed());
        System.out.println("Logan GPS: " + logan.getgps());
        
        Ford ford=new Ford();
        System.out.println("Ford Model: " + ford.getModelName());
        System.out.println("Ford Reg. No: " + ford.getRegistrationNumber());
        System.out.println("Ford Owner: " + ford.getOwnerName());
        System.out.println("Ford Speed: " + ford.getspeed());
        System.out.println("Ford GPS: "+ ford.gettempControl());
		// TODO Auto-generated method stub

	}

}
