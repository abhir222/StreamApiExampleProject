package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(-1,5,4,6,7,9,3,40,20,3,0,30);
		Integer maxNum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxNum);
		
		Integer minNum = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minNum);
		
	}

}
