package com.functionalinterface;

import java.util.function.Function;

public class CustomFunction {

	public static void main(String[] args) {
		Function<Integer, Double> half = a -> a / 2.0;

		// Applying the function to get the result
		System.out.println(half.apply(10));
		
		
			
		
	}
}
