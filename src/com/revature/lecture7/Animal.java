package com.revature.lecture7;

public abstract class Animal {
	String name;
	boolean isHungry=true;
	
	public Animal() {}
	
	public abstract void eats();
	
	public abstract void moves();
	
	public void sleep() {
		System.out.println("zzzzzz");
	}
	
}
