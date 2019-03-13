package com.revature.lecture4;

public class IfElseExamples {


	public static void main(String[] args) {

		/*
		//There must be a boolean expression in the 
		 //parentheses 
		if(0) {

		}else {

		} 
		 */

		//Example of an if statement without curly braces
		int numToBeTested = 5;
		if(9>numToBeTested) {
			int myLocalVariable = 90;
			System.out.println("this is valid- no culry braces needed");
		}
		else System.out.println("this is also valid");

		//Ternary operator example 
		// holds the returned value...boolean exp ? returned if true : returned if false;

		int ternaryExample =(9>numToBeTested)? 4:5;



		System.out.println(ternaryExample);


		//if else if without curly braces 
		if (9> numToBeTested) System.out.println("you can do this too");
		else if(9 == numToBeTested) System.out.println("don't though- it's confusing");
		else {
			System.out.println("Yep I can throw a block in there now if I want to!");

		}

		//Some of the pitfalls of not having curly braces 
		int x = 0;
		numToBeTested = 8;
		
		

		if (x==0) {
			if 
				(5>numToBeTested) System.out.println("valid");
			else 
				System.out.println("why would you do this?");//this executes as though this were a typically written nested if else statement
		}
		
	String myName = "Bryn";
		
	}
	
	//myName = "B"; Can't access myName outside of the method
}
