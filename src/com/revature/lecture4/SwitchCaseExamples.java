package com.revature.lecture4;

public class SwitchCaseExamples {
	public static void main(String[] args) {
		//Can only switch on int convertible types, Strings, enums 
		/**
		 * Can't switch on doubles
		double varToTest = 0.0;
		switch(varToTest) {
		}
		*/
		
		//Cases must be compile time constants: literals, final constant variables, enum constants
		String mySwitchString = "A";
		String notAConstant = "Not a constant";
		final String finalString = "see this is okay";
		switch(mySwitchString) {
		//case notAConstant:
			//System.out.println("this won't compile");
		case "This is perfectly fine": 
			System.out.println("See this compiles fine because it's a literal!");
			break;
		case finalString: 
			System.out.println("Final variables work just fine!");
			break;
		//case 'J':
			//System.out.println("This won't compile because case "
				//	+ "statements must be of the same datatype");
			// break;
		default:
			System.out.println("That about sums up the rules of writing a switch statement");
		}
		
		System.out.println();
		
		//Nuances of the switch statement
		String nuancedSwitchStatement = "news";
		switch(nuancedSwitchStatement){
			default: 
				System.out.println("Everything that doesnt match another case\n"
						+ " will enter into default\n"
						+ "and will run through case statements afterwards\n"
						+ "until either a break statement or the end of the\n"
						+ "switch.\n");
			case "happy":
				System.out.println("See even unhappy enters into here.");
				break;
			case "new": 
				System.out.println("Entered into the new case");
				break;
			case "new girls":
				System.out.println("The literals must match exactly!");
		}
		
		
		
		
		
	}
}
