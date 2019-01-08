package com.revature.lecture9.exceptionexample;

public class MyRuntimeException extends RuntimeException{
	public MyRuntimeException() {
		
	}
	public MyRuntimeException(String message) {
		super(message);
	}
}
