package com.upskill.java_5;

public class InterfaceImpementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 door");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My Car has 4 Wheel");
		return 4;
	}

	@Override
	public void iColor() {
		System.out.println("My Car has is Black");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My Car has 3.5 litter v6 Engine");
		return "3.5 litter v6 Engine";
	}

}
