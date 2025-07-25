package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Logan-8";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "345R345";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "vara";
	}
	public int getspeed() {
		return 80;
	}
	public int getgps() {
		return 0;
	}

}
