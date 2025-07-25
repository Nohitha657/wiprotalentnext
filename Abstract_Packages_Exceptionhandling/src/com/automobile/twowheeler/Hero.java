package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS09AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Rahul";
    }

    public int getSpeed() {
        return 70; // current speed
    }

    public void radio() {
        System.out.println("Radio is now ON in Hero bike.");
    }
}

