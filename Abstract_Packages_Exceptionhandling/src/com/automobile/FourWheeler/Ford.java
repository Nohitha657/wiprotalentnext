package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Ford7";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "234456T345";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Ram";
	}
	public int getspeed() {
		return 120;
	}
	public int gettempControl() {
		return 100;
	}

}
