package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
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

    public void cdplayer() {
        System.out.println("you can play the songs in the available cd player");
    }
}

