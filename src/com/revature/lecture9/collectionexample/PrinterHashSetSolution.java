package com.revature.lecture9.collectionexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrinterHashSetSolution {
	Set<String> container;
	
	public PrinterHashSetSolution() {
		container = new HashSet<>();
	}
	
	public void printContainer() {
		Iterator<String> myItr = container.iterator();
		while(myItr.hasNext()) {
			System.out.println(myItr.next());
		}
		//show this could also just be an enhanced 
		//for loop
	}
	
	public void addToContainer(String[] addMe) {
		for(String s: addMe) {
			container.add(s);
		}
	}
	
	public static void main(String[] args) {
		PrinterHashSetSolution example = new PrinterHashSetSolution();
		String[] addMe = {"one", "two", "three"};
		example.addToContainer(addMe);
		example.printContainer();
		System.out.println();
		String[] addMeToo = {"four", "five", "six", "seven", "eight", "nine"};
		example.addToContainer(addMeToo);
		example.printContainer();
	}
}
