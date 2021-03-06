package com.revature.lecture5.items;


public class Balloon {

	//Most public to least 
	
	public static int count= 0;

	//accessible from any class anywhere 
	public String color="Pink";

	//accessible only to classes in the same package and subclasses 
	protected String ribbonColor;

	//Default or package private- only accessible to classes in the 
	//same package 
	boolean canFloat;

	//most private- only accessible within this class 
	private String contents = "";

	public Balloon() {
		count ++;
	}
	

	//Show that this constructor gets rid of the default no args constructor
	public Balloon(String color, String ribbonColor, boolean canFloat) {
		this(canFloat, color, ribbonColor, "helium");
		count ++;
		this.color = color;
		this.ribbonColor =ribbonColor;
		this.canFloat = canFloat;
		//contents="nothing";
	}
	
	public Balloon( boolean canFloat, String color, String random, String moreRandom) {
		count++;
		this.color = color;
		this.canFloat = canFloat;
		contents = moreRandom;
		ribbonColor = random;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color, String dun) {
		if(!color.equals("red")) {
			return;
		}
		this.color = color;
	}


	public String getRibbonColor() {
		return ribbonColor;
	}


	public void setRibbonColor(String ribbonColor) {
		this.ribbonColor = ribbonColor;
	}


	public boolean isCanFloat() {
		return canFloat;
	}


	public void setCanFloat(boolean canFloat) {
		this.canFloat = canFloat;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}




	//Object method- allows us to easily print Balloon objects
	@Override
	public String toString() {
		return "Balloon [color=" + color + ", ribbonColor=" + ribbonColor + ", canFloat=" + canFloat + ", contents="
				+ contents + "]";
	}
	
	
	

	//Primitive values get copied
	public void changeValue(int value) {
		System.out.println("initial value in changeValue method "+value);
		value+= 5;
		System.out.println("final value within changeValue method "+value);
	}

	
	
	
	//the meaning of static will be covered tomorrow
	public static void modifyBalloonObject(Balloon balloon) {
		//we start with our basic balloon object passed in
		System.out.println(balloon);

		//change the colors to blue 
		balloon.color = "blue";
		balloon.ribbonColor = "blue";
		System.out.println(balloon);

		//try to change the object to a new balloon object 
		balloon = new Balloon();
		System.out.println(balloon);

	}


	
	public static void main(String[] args) {
		//Primitive which we try to use as an argument in order to change 
		//its value
		int valueToPassIn = 8;
		Balloon b = new Balloon();
		
		b.changeValue(valueToPassIn);
		
		System.out.println("Value after being passed through changeValue "+valueToPassIn);

		modifyBalloonObject(b);
		System.out.println(b);

	}
	
	

}
