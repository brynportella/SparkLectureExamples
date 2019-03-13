package com.revature.lecture9.collectionexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.revature.lecture3.Dog;

public class GenericsDemo {
	
	public static void main(String[] args) {
		String myString = "hello";
		ArrayList<String> myList = new ArrayList<>();
		myList.add(myString); 
		myList.add(myString); 
		myList.add(myString); 
		myList.add(myString); 
		myList.add(myString);
		
		for( String myEle: myList) {
			System.out.println(myEle + " Dolly");
		}
		
		Iterator<String> runner = myList.iterator();
		while(runner.hasNext()) {
			System.out.println(runner.next()+" Dolly");
			
			
			Map<String, Dog> myMap = new HashMap<>();
			
			myMap.put("Fido", new Dog());
			
			for(Dog mydog: myMap.values()) {
				System.out.println(mydog);
			}
			
			
			
		}
	}
}
