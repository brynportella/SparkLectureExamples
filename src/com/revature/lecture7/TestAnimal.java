package com.revature.lecture7;

public class TestAnimal {
	public static void main(String[] args) {
		Animal myAnimal = new Bird();
		myAnimal.moves();
		myAnimal.sleep();
		((Bird)myAnimal).fly();
		 Bird myNewAnimal = (Bird) myAnimal;
		myNewAnimal.eats();
		myNewAnimal.eats("bird seed");
		
		 mylabel:
			 for (int i=0; i<5; i++) {
				 System.out.println(i);
				 for(int y= 0; y<10; y++) {
					 System.out.println(y);
					 if (y==3) break mylabel;
				 }
			 }
	}
}
