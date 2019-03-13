package com.revature.lecture9.mapexample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import static java.lang.Math.abs;


public class MapPractice {
	public static void main(String[] args) {
		//Doesn't preserve insertion order 
		Map<Integer, String> myHashMap = new HashMap<>();
		myHashMap.put(1, "A");
		myHashMap.put(7, "E");
		myHashMap.put(3, "I");
		myHashMap.put(9, "O");
		myHashMap.put(5, "U");
		myHashMap.put(-100, "Y");
		

		for (Map.Entry<Integer, String> myCurrEntry : myHashMap.entrySet()) {
			System.out.println(myCurrEntry.getKey());
			System.out.println(myCurrEntry.getValue());
			System.out.println();
		}
		//Sorts the map  
		Map<Integer, String> myNaturallySortedMap = new TreeMap<>();
		
		myNaturallySortedMap.putAll(myHashMap);

		for (Map.Entry<Integer, String> entry : myNaturallySortedMap.entrySet()) {
			System.out.println(entry);
		}
		
		System.out.println("My weirdly sorted map");
		
		Map<Integer, String> myWeirdlySortedMap= new TreeMap<>(new SortByAbsoluteValue());
		
		myWeirdlySortedMap.putAll(myHashMap);
		
		for(Map.Entry<Integer, String> entry : myWeirdlySortedMap.entrySet()) {
			System.out.println(entry);
		}
	}
	
}

