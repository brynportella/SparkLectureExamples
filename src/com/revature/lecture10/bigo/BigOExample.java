package com.revature.lecture10.bigo;

import java.util.ArrayList;
import java.util.Comparator;

public class BigOExample {
	static ArrayList<Integer> data = new ArrayList<>();
	
	//static- constant time 
	// O(1)
	static public void myMethod(Integer[] myList) {
		System.out.println("Isn't this fun!"); //O(1)
		System.out.println("This is the list size "+myList.length);//O(1)
		System.out.println("I want to print some more instructions");
		System.out.println("Are you tired of seeing print statements yet?");
	}
	
	//method to search for element assuming not sorted 
	//what if we want to print all the elements out 
	//what if we want to print them out as we found them
	//O(n)
	static public boolean myContains(Integer i) {
		for(Integer curEle: data) {
			System.out.println(curEle);
		}
		System.out.println();
		 for(Integer curEle: data) {
			 if(curEle.equals(i)) {
				 return true;
			 }
		 }
		 return false; 
	 }
	
	//method to search for element assuming sorted list 
	//binary search 
	
	static public boolean binarySearch(Integer element) {
		int left = 0;
		int right = data.size();
		while(left<right) {
			int midPoint = (left+right)/2;
			if (data.get(midPoint)== element) {
				return true;
			}else if (element < data.get(midPoint)) {
				right = midPoint;
			}else {
				left = midPoint+1;
			}
		}
		return false; 
	}
	
	
	//method to print a square matrix given the data 
	
	public static void main(String[] args) {
		Integer[] myArray = {1 , 6, 3, 5, 7};
		
		myMethod(myArray);
		
		//populate list 
		data.add(1);
		data.add(5);
		data.add(2);
		data.add(9);
		
		System.out.println(data);
		
		System.out.println(myContains(5));//true
		
		System.out.println(myContains(8));//false
		
		//sort list 
		BigOExample b = new BigOExample(); 
		data.sort(b. new IntegerComparator());
		System.out.println(data);
		System.out.println(binarySearch(9));
		System.out.println(binarySearch(20));
	}
	
	//Sort list
	public class IntegerComparator implements Comparator<Integer>{
		public int compare(Integer i, Integer j) {
			return i.compareTo(j);
		}
	}
	
}
