package com.revature.lecture6.statickeyword;

public class StaticExamplesTester {
	public static void demoStaticFieldsViaObj() {
		
		//Difference between instance and static 
		//when accessed through objects 
		StaticExamples myObjOne = new StaticExamples();
		StaticExamples myObjTwo = new StaticExamples();
		
		//Print orginal values 
		System.out.println(myObjOne);
		System.out.println(myObjTwo);

		
		//Change them through objects 
		myObjOne.setMyInstanceInt(0);
		myObjOne.setMyStaticInt(0);

		System.out.println();

		//Note that the static variable change
		//persisted to the other object 
		System.out.println(myObjOne);
		System.out.println(myObjTwo);

	}
	
	public static void demoAccessToStaticFields() {
		StaticExamples myObjOne = new StaticExamples();
		StaticExamples myObjTwo = new StaticExamples();

		StaticExamples.myStaticInt = 300;

		System.out.println();
		System.out.println(myObjTwo);

		new SideMethod().changeMyStaticInt();

		System.out.println();
		System.out.println(myObjOne);
	}

	
	
	
	public static void main(String[] args) {
		
		demoStaticFieldsViaObj();
		
		demoAccessToStaticFields();
	}

}
