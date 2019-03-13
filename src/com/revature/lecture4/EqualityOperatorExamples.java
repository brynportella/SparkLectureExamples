package com.revature.lecture4;

public class EqualityOperatorExamples {
	int myField = 0;
	
	//This is a constructor- we'll cover these 
	//in lecture next week- they allow you to 
	//instantiate an object 
	public EqualityOperatorExamples() {	
	}
	
	//this is another constructor
	public EqualityOperatorExamples(int myField) {
		this.myField = myField;
	}
	
	
	public static void main(String[] args) {
		//Some things that aren't allowed
		char c = 250;
		boolean x = (c == 7); //doesn't compile 

		//boolean y = (false != "some String"); //doesn't compile

		//boolean z = 3 == "some other string"; //doesn't compile 
		
		
		//Object Equality 
		//Here I create three EqualityOperatorExampleObjects
		//they all have 9 as their only value
		//However firstEx and secondEx point to different places
		//in memory.
		EqualityOperatorExamples firstEx = new EqualityOperatorExamples(9);
		EqualityOperatorExamples secondEx = new EqualityOperatorExamples(9);
		EqualityOperatorExamples thirdEx = secondEx;
		
		
		
		//Compares the references - NOT THE VALUES
		System.out.println(firstEx == secondEx);//false
		System.out.println(thirdEx == secondEx);//true
		
		//Some things that are allowed (promotion of numeric types)
		if(5.0 == 5) {
			System.out.println("5.0 is == to 5");
		}
		
		//Some weird stuff with char as a number
		char two = 50;
		System.out.println(two);
		
		char twoChar = '2';
		if(two == twoChar) {
			System.out.println("'2' is equal to 50 cast as a char");
		}
		
		if (Integer.MAX_VALUE == Short.MAX_VALUE) {
			System.out.println("this isn't true");
		}else {
			System.out.println("This compiles because numeric primitive values are automatically promoted.");
		}
		
		
	}
}
