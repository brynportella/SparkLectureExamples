package com.revature.lecture9.exceptionexample;

public class TestMyExceptions {
	public static void main(String[] args) {
		//myMethod();
		
		myOtherMethod("Hello world!");
	}
	
	public static void myMethod() {
		System.out.println("in my method");
		throw new MyRuntimeException();
	}
	
	public static void myOtherMethod(String message) {
		throw new MyRuntimeException(message);
	}
}
