package com.revature.lecture7;

public abstract class Animal {
	String name;
	boolean hungry=true;
	
	public Animal() {}
	
	public void setName(String name) {
		if(name.length()>0) {
			this.name = name;
		} else {
			this.name = "john doe";
		}
	}
	
	public String getName() { return name;}
	
	public abstract void eats();
	
	public abstract void moves();
	
	public  void sleep() {
		System.out.println("zzzzzz");
	}
	
}
