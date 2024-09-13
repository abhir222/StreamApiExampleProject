package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,4,5,6,3,7,8,0);
		
		//even numbers
		List<Integer> evenNumbers = list.stream().filter(n->n%2==0)
						.collect(Collectors.toList());
		System.out.println("Evens: "+ evenNumbers);
		
		//odd numbers
		List<Integer> oddNumbers = list.stream()
						.filter(n->n%2==1)
							.collect(Collectors.toList());
		System.out.println("Odds: "+ oddNumbers);
	}
	

}
