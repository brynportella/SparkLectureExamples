package com.revature.lecture7;

public class Bird extends Animal implements Flyable{

	@Override
	public void fly() {
		System.out.println("Flap Flap flap!");
	}

	@Override
	public void eats(){
		// TODO Auto-generated method stub
		hungry = false;
		System.out.println("Yumm worms!");
		
		return;
	}
	
	public void eats(String food) {
		hungry = false;
		
		System.out.println("Thanks for the food "+food);
	}

	@Override
	public void moves() {
		fly();
		System.out.println("fly little bird! fly");
		
	}
	
	
	public void sleep() {
		super.sleep();
		System.out.println("tweet snore");
	}
	
	


}
