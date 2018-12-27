package com.revature.lecture4;

public class ForLoopExamples {
	public static void main(String[] args) {
		//infinite for loop 
		/*for (;;) {
		}
		*/
		
		
		int j = 0;
		
		//Initialization statement only runs once! 
		//But it isn't restricted in the same way the second portion of 
		//the for loop is (i.e. it doesn't have to be a statement of a particular type)
		for (System.out.println(j++);j<3;) {
			j++;
		}
		//With one caveat: 

		//Variables defined in the initialization block must all be of the same type 
		/*
		for (int i = 0, long g = 100L; i<100 && g>0; g--, i++) {
		}
		*/
		
		
		//You can declare multiple variables of the same type in the 
		//initialization statement
		for (int i = 0, k = 10; i<10 && k>0; k--, i++) {
			System.out.println(i+" "+k);
		}
		
		
		for(;j<10;) {
			System.out.println(j++);
		}
		//Must be a boolean expression
		/*
		for (;j+10;) {
		}
		*/
		
		//Update can be any statement
		for (; j>0; System.out.println(j--)) {
			//this can be empty
		}
		System.out.println();
		
		//enhanced for loop
		int[] arrayOfInts = {1,2,4,2,5,6,7};
		for( int i : arrayOfInts) {
			System.out.println(i);
		}
		System.out.println();
		
		//Enhanced for loop to iterate through a string 
		String myName = "Bryn";
		for(char c: myName.toCharArray()) {
			System.out.println(c);
		}

	}
}
