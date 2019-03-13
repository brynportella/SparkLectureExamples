package com.revature.lecture2;

public class Dog {
	String furColor = "grey";
	String furSoftness= "soft";
	double lengthOfLegs= 1.3;//in feet 
	Foot dogFoot = new Foot();
	boolean amHungry = true;
	
	public void eat() {
		amHungry = false;
		System.out.println("I am fulll I guess");
	}
	
	public void cuddle() {
		System.out.println("I am cuddling");
	}
	
	public void bark() {
		System.out.println("Woof");
	}
	
	
	
	public static void main(String[] args) {
		Dog myDogObject = new Dog();
		Dog myDogObject1 = new Dog();
		Dog myDogObject2 = new Dog();
		Dog myDogObject3 = new Dog();
		int a = 0;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(4%2);
		
		for (int count = 1; count <  5; count++) {
		    count = count + count;
		}
		
	}
	

}

