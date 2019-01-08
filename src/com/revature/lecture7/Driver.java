package com.revature.lecture7;

public class Driver {
	public static void main(String[] args) {
		Animal doggy = new Dog();
		doggy.sleep();
		doggy.eats();
		doggy.moves();
		
		Animal birdy = new Bird();
		//((Dog)birdy).catchesFrisbee();
		((Dog)doggy).catchesFrisbee();
		
		birdy.moves();
		birdy.eats();
		
		int randomNum = (int)(Math.random()*2);
		Animal mystery = (randomNum>0)? new Bird():new Dog();
		mystery.moves();
		
		System.out.println(Math.PI);
		
	}
}
