package com.revature.lecture3;

public class Dog {
	double size = 5;
	String name ;
	String color;
	
	public void changeColor() {
		System.out.println("Changing color");
		color += " bb";
	}
	
	public void grow() {
		size++;
		changeColor();
	}
	
	public static void main(String[] args) {
		Dog bobby;
		bobby = new Dog();
		bobby.name = "Bobby";
		bobby.color = "brown";
		int i = 10;
		Object myObject = new Dog();
		//Dog myDog = new Object();
		myObject = bobby;
		
		System.out.println("This is our dog: "+bobby.name+" "+bobby.color+" "+bobby.size);
	}

	@Override
	public String toString() {
		return "Dog [size=" + size + ", name=" + name + ", color=" + color + "]";
	}
	
	
	

}
