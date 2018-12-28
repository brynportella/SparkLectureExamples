package com.revature.lecture5;

public class MyObject {
	private int verySecretValue = 77;
	protected int notSoSecretValue = 99;
	int secretValue = 10;
	public int notSecretValue = 0;
	
	public int getSecretValue() {
		return verySecretValue;
	}
	
	public void setSecretValue(int i) {
		verySecretValue = i;
	}
	
	public void printMe() {
		System.out.println("verySecretValue ="+verySecretValue);
		System.out.println("secretValue ="+secretValue);
		System.out.println("notSoSecretValue ="+notSoSecretValue);
		System.out.println("notSecretValue ="+notSecretValue);
	}
}
