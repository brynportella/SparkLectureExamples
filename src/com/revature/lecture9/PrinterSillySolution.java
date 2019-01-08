package com.revature.lecture9;

public class PrinterSillySolution {
	String[] container;
	int firstEmpty = 0;
	
	public PrinterSillySolution() {
		container = new String[5];
	}
	
	public void printContainer() {
		for (String s: container) {
			System.out.println(s);
		}
	}
	
	public void addToContainer(String[] addMe) {
		if(container.length-firstEmpty >= addMe.length) {
			int index = 0;
			for(int i=firstEmpty; i< container.length-firstEmpty; i++, firstEmpty++ ) {
				container[i] = addMe[index++];
			}
			
		}else {
			String[] replacement = new String[container.length+addMe.length];
			int index = 0;
			while (index < firstEmpty) {
				replacement[index] = container[index++];
			}
			int addMeIndex = 0;
			while(addMeIndex<addMe.length) {
				replacement[index++] = addMe[addMeIndex++];
				firstEmpty++;
			}
			container = replacement;
		}
	}
	
	public static void main(String[] args) {
		PrinterSillySolution example = new PrinterSillySolution();
		String[] addMe = {"one", "two", "three"};
		example.addToContainer(addMe);
		example.printContainer();
		System.out.println();
		String[] addMeToo = {"four", "five", "six", "seven", "eight", "nine"};
		example.addToContainer(addMeToo);
		example.printContainer();
	}

}
