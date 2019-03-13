package com.revature.lecture9.collectionexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionExampleArrayList {
	 public static void main(String[] args) {
		 //List: ordered- insertion order is maintained 
		 // allow duplicates 
		 //Iterable
		Collection<String> myArrayList = new ArrayList<>();
		myArrayList.add("Bryn");
		myArrayList.add("Bob");
		myArrayList.add("Jane");
		
		
		
		// Type currVariable: yourCollection
		for(String ele: myArrayList) {
			System.out.println(ele);
		}
		
		
		
		
		Iterator<String> itr = myArrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		List<String> myArrayListCast = (List<String>)myArrayList;
		
		for( int i = 0; i< myArrayListCast.size(); i++) {
			String myCurrentElement = myArrayListCast.get(i);
			System.out.println(myCurrentElement);
		}
	}
}
