package com.revature.lecture7;

public class Bird extends Animal {

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		isHungry = false;
		System.out.println("Yumm worms!");
	}

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		System.out.println("fly little bird! fly");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}

}
