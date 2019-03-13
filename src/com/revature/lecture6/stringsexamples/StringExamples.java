package com.revature.lecture6.stringsexamples;

import java.util.Scanner;

public class StringExamples {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tell me your name: ");
		//Creates a String obj- just as new String() would
		String name = scanner.nextLine();
		System.out.println("Hi "+name+", let's play a guessing game. Give me a number");
		
		//This can go wrong
		int myInt = scanner.nextInt();
		
		
		System.out.println("This is your number: "+myInt);
		//Create guessing game:
		//Demo random number generation
		int num = (int)(Math.random()*10)+1;
		
		while(num != myInt) {
			
			if( num>myInt) {
				System.out.println("Your guess was too low");
			}
			System.out.println("Guess again: ");
			myInt = scanner.nextInt();
		}
		
		System.out.println("Congratulations you won!");
		//reverse input to demo some String methods  
		//System.out.println("Hiya!"+ reverseMyStringArray("Hiya!"));

	}
	
	
	
	
	//Reverse a string method one 
	//toCharArray()
	public static String reverseMyStringArray(String s) {
		String reversedString = "";
		for(char c : s.toCharArray()) {
			reversedString = c+reversedString;
		}
		return reversedString;
	}
	
	//Reverse a string method two 
	//demo charAt(int i) and length() 
	public static String reverseWithIndex(String s) {
		return s;
	}
	
	//Reverse a string method three-> StringBuffer(thread safe) and StringBuilder 
	
	String reverseStringSimplified(String input) {
		StringBuilder inputConverted = new StringBuilder(input);
		return new String(inputConverted.reverse());
	}
	
	
}
