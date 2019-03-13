package com.revature.lecture16;

public class LabelExample {
	public static void main(String[] args) {
		mylabel:
			for (int i=0; i<5; i++) {
				System.out.println(i);
				for(int y= 0; y<10; y++) {
					System.out.println(y);
					if (y==3) break mylabel;
				}
			}
	}
}
