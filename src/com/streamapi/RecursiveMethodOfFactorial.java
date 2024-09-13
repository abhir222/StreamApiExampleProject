package com.streamapi;

public class RecursiveMethodOfFactorial {

	public static void main(String[] args) {

		long n = 10;
		long result = factorialOf(n);
		System.out.println(result);
	}

	static long factorialOf(long n) {
		
		if(n == 0) {
			return 1;
		}else {
			return n * factorialOf(n-1);
		}
		
	}

}
