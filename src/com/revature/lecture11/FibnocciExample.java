package com.revature.lecture11;

public class FibnocciExample {
	
	
	
	public static int fib(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return (fib(n-2) + fib(n-1));
	}
	
	
	
	
	
	
	
	
	public static int loopFib(int n) {
		int prev = 0;
		int curr = 1;
		int fibNum = 0;
		for (int i = 2; i<=n; i++) {
			fibNum = prev + curr;
			prev = curr;
			curr = fibNum;
		}
		return fibNum;
	}
	
	public static void main(String[] args) {
		System.out.println(loopFib(5));
		System.out.println(fib(5));
	}

}
