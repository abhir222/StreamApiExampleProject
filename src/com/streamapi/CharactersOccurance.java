package com.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersOccurance {

	public static void main(String[] args) {

		String str = "javaprogram";
		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		System.out.println(map);
		
				//or by using mapOfObj
		Map<Character, Long> collect = str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		System.out.println(collect);
	}

}
