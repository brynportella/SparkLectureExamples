package com.revature.lecture7;

public class Driver {
	public static void main(String[] args) {
		Animal doggy = new Dog();//covariant types
		
		Flyable f = new Bird(); 
		doggy.eats();
		
		//((Dog)doggy).catchesFrisbee();
		
		doggy.sleep();
		doggy.eats();
		doggy.moves();
		/*
		Animal birdy = new Bird();
		((Dog)birdy).catchesFrisbee();
		((Dog)doggy).catchesFrisbee();
		
		birdy.moves();
		birdy.eats();
		
		birdy.sleep();
		*/
		
		int randomNum = (int)(Math.random()*2);
		Animal mystery = (randomNum>1)? new Bird():new Dog();
		mystery.moves();
		myAnimalsDoStuff(mystery);
		
//		System.out.println(Math.PI);
		
	}
	
	
	public static void myAnimalsDoStuff(Animal animal) {
		animal.eats();
		animal.moves();
	}
}
