package com.revature.lecture9.collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class PrinterBetterSolution {
	ArrayList<String> container; 
	
	public PrinterBetterSolution() {
		container = new ArrayList<>();
	}
	
	public void printContainer() {
		Iterator<String> itr = container.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void addToContainer(String[] addMe) {
		for(String s: addMe) {
			container.add(s);
		}
	}
	
	public static void main(String[] args) {
		PrinterBetterSolution example = new PrinterBetterSolution();
		String[] addMe = {"one", "two", "three"};
		example.addToContainer(addMe);
		example.printContainer();
		System.out.println();
		String[] addMeToo = {"four", "five", "six", "seven", "eight", "nine"};
		example.addToContainer(addMeToo);
		example.printContainer();	}
}
