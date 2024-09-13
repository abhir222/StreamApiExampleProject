package com.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,4,6,7,9,3,40,20,3,0,30,1);
		
		//Second Highest Number
		int secondHighestNumber = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondHighestNumber);
		
		//second lowest number
		int secondLowestNumber = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondLowestNumber);
		
	}

}
