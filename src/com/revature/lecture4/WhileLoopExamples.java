package com.revature.lecture4;

public class WhileLoopExamples {
	public static void main(String[] args) {
		/*Unreachable Code- will not compile 
		 * java.lang.Error:Unresolved compilation problem: 
		 * Unreachable code 
		 * while(false) {	
		}
		*/
		
		/*
		// Another example of unreachable code
		while (5 == 9) {
		}
		*/
		int five = 5;
		while (five == 9) {
			//Dead code 
			//this is okay because five is not a compile time constant
		}
		final int six = 6;
		/* Since six is final-it's a compile time constant and 
		 * the compiler understands that this is unreachable code
		while(six == 9) {
		}
		*/
		
		int growUpToTen = 0;
		while(growUpToTen<=10) {
			System.out.println(growUpToTen++);
			System.out.println("hi");
		}
		
		System.out.println("Final val of growUpToTen "+growUpToTen);
		System.out.println("Now a do while loop that outputs the same thing");
		
		growUpToTen = 0;
		//use a do while if you know that you want the code to execute at least once
		do {
			System.out.println(growUpToTen++);
		}while(growUpToTen<=10);
		System.out.println("Final val of growUpToTen "+growUpToTen);
		
		//They really can be used for the same purposes
	}
}
