package com.revature.lecture9.mapexample;

import static java.lang.Math.abs;

import java.util.Comparator;


public class SortByAbsoluteValue implements Comparator<Integer>{
	public int compare(Integer one, Integer two) {
		if(abs(one)<abs(two)) {
			return -1;
		}else if (one == two) {
			return 0;
		}else {
			return 1;
		}
	}
}


