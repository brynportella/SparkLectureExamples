package com.revature.lecture7;

public class Child extends Parent{
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		System.out.println(child.addMe(0));
		System.out.println(child.name);
		System.out.println(parent);
	}
}
