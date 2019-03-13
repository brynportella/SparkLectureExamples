package com.revature.lecture9.exceptionexample;

public class MyRuntimeException extends RuntimeException{
	public MyRuntimeException() {
		super("my exception that indicates something important");
	}
	public MyRuntimeException(String message) {
		super(message);
	}
}
