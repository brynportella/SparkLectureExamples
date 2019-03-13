package com.revature.lecture7;

public class Dog extends Animal {
	public Dog() {
		name = "Bryn";
		hungry = true; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void eats() {
		System.out.println("I am eating kibble");
		hungry = false;
	}

	@Override
	public void moves() {
		System.out.println("I am running on four legs");
	}
	
	public void sleep() {
		//super.sleep();
		System.out.println("Snore snore snores");
	}
	
	public void catchesFrisbee() {
		System.out.println("Woof I caught it!");
	}
}
