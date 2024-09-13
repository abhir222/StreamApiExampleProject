package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,4,6,7,9,3,40,20,3,0,30);
		
		List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(l);
		
		int sum = list.stream().limit(5).reduce((p,q)->p+q).get();
		System.out.println(sum);
		
		List<Integer> sk = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(sk);
		
		int skSum = list.stream().skip(5).reduce((p,q)->p+q).get();
		System.out.println(skSum);
	}

}
