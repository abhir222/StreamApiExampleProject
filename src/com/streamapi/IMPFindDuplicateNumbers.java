package com.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IMPFindDuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(9, 10, 1, 2, 1, 3, 8, 4, 5, 9, 6, 3, 10, 3, 1);
		
		Set<Integer> duplicateNum = list.stream().filter(e -> Collections.frequency(list, e) > 1)
				.collect(Collectors.toSet());
		System.out.println(duplicateNum);
		
		//using HashSet
		Set<Integer> dupliNum = new HashSet<>();
		Set<Integer> dup = list.stream().filter(e -> !dupliNum.add(e)).collect(Collectors.toSet());
				
		System.out.println(dup);
	}
}
