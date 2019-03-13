package com.revature.lecture5.stores;

//Balloon import
import com.revature.lecture5.items.Balloon;


public class BalloonStore{
	//Create a Balloon object using fully qualified name  
	static Balloon balloon = new Balloon();
	

	public static void main(String[] args) {
		System.out.println(balloon);
		
		balloon.color = "Blue";
		
		
		
	}
	
	
}
