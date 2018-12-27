package com.revature.lecture4;

public class ShortCircuitExamples {
	public static boolean printAndReturnTrue() {
		System.out.println("This method is returning true!");
		return true;
	}
	
	public static void main(String[] args) {
		//Not a short circuit And Operator
		if(false & printAndReturnTrue()) {
			System.out.println("This won't ever be printed!");
		}else {
			System.out.println("That statment will always evaluate to false!");
		}
		
		//A short ciruit And Operator 
		if(false && printAndReturnTrue()) {
			System.out.println("This also won't be printed");
		}else {
			System.out.println("That statement won't execute the method!");
		}
	}
}
