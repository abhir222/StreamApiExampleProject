package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbersInStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,2,12);
		Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
		System.out.println("Sum of the numbers: "+sum.get());
	}

}
