package com.core.test;

public class Traveller {
	Vehicle v;
	
	public void startJourney(){
		System.out.print("Journey Starts by :"); 
		v.move();
		
	}
	
	public void setVehicle(Vehicle v){
		this.v = v;
	}
	
	public static void main(String args[]){
		Traveller t = new Traveller();
		t.setVehicle(new MotorCycle());
		t.startJourney();
		
		Traveller t2 = new Traveller();
		t2.setVehicle(new Plane());
		t2.startJourney();
	}
}
