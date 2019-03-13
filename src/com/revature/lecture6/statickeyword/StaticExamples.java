package com.revature.lecture6.statickeyword;

public class StaticExamples {
	
	static int myStaticInt = 7;
	private int myInstanceInt = -7;
	
	
	public static int getMyStaticInt() {
		
		//System.out.println(new StaticExamples().myInstanceInt);
		return myStaticInt;
	}

	public static void setMyStaticInt(int myStaticInt) {
		//Note you can't use this in a static context 
		StaticExamples.myStaticInt = myStaticInt;
	}

	public int getMyInstanceInt() {
		myStaticInt = 10;
		return myInstanceInt;
	}

	public void setMyInstanceInt(int myInstanceInt) {
		this.myInstanceInt = myInstanceInt;
	}
	
	public String toString() {
		return "StaticExamples [myInstanceInt=" + myInstanceInt +" myStaticInt="+myStaticInt+ "]";
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		myStaticInt = 10_000_000;
		
		
	}
}
