package com.revature.lecture3;

public class ArrayExamples {
	public static void multiDimensionalArrays() {
		
		//curly braces to declare a multidimensional- array of arrays 
		//each having different dimensions 
		int[][] myMultiArray = {{1,2,3,4} ,{2,3}};
		
		System.out.println(myMultiArray[0][3]);
		System.out.println(myMultiArray[1][1]);
		
		//Slightly more dynamic way to declare a multi-dim array
		//where each of the "sub-arrays" have different dimensions
		int[][] funkyDeclaration = new int[5][];
		funkyDeclaration[0] = new int[3];
		
		funkyDeclaration[0][1] = 9;
		System.out.println(funkyDeclaration[0][1]);
		
		funkyDeclaration[1] = new int[4];
		
		
		
	}
	
	public static void main(String[] args) {
		multiDimensionalArrays();
	}
}
