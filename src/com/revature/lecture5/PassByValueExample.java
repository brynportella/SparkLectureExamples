package com.revature.lecture5;

public class PassByValueExample {

	public void primitiveExample(int i) {
		i = i+100;
		System.out.println("i inside primitive example = "+i);
	}

	public void myObjectChanger(MyObject myObject) {
		myObject.notSecretValue = -100;
		myObject.notSoSecretValue = -20;
		myObject.printMe();
		System.out.println();
		myObject = new MyObject();
		myObject.setSecretValue(-10);
		myObject.secretValue = -10;
		myObject.notSecretValue = -10;
		myObject.notSoSecretValue =-10;
		myObject.printMe();
		System.out.println();
	}

	public static void main(String[] args) {
		int i = 30;
		System.out.println("i before prim example = "+i);
		PassByValueExample executor= new PassByValueExample();
		executor.primitiveExample(i);
		System.out.println("i after prim example = "+i);

		MyObject objectExample = new MyObject();
		objectExample.printMe();
		System.out.println();
		executor.myObjectChanger(objectExample);
		objectExample.printMe();
		

	}

}
