package com.revature.lecture9.comparableexample;

public class Student implements Comparable<Student> {
	String name;
	Long studentID;
	
	@Override
	public int compareTo(Student arg0) {
		return studentID.compareTo(arg0.studentID);
	}
	
}


