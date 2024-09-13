package com.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12,45,6,61,32,2,3);
		
		List<Integer> ascSorting = list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascSorting);
		
		List<Integer> descSorting = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descSorting);
	}

}
