package com.revature.lecture7;

public class Dog extends Animal {
	
	
	@Override
	public void eats() {
		System.out.println("I am eating kibble");
		isHungry = false;
	}

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		System.out.println("I am running on four legs");
	}
	
	public void sleep() {
		super.sleep();
		System.out.println("Snore snore snores");
	}
	
	public void catchesFrisbee() {
		System.out.println("Woof I caught it!");
	}
}
