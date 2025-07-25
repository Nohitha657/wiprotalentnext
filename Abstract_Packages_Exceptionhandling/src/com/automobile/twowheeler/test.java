package com.automobile.twowheeler;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Hero hero = new Hero();
        System.out.println("Hero Model: " + hero.getModelName());
        System.out.println("Hero Reg. No: " + hero.getRegistrationNumber());
        System.out.println("Hero Owner: " + hero.getOwnerName());
        System.out.println("Hero Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda();
        System.out.println("Honda Model: " + honda.getModelName());
        System.out.println("Honda Reg. No: " + honda.getRegistrationNumber());
        System.out.println("Honda Owner: " + honda.getOwnerName());
        System.out.println("Honda Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}
