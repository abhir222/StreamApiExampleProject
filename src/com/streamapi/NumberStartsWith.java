package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(221, 25, -245, 325, 62, 291);
		
		List<String> numbersStartsWith = numbers.stream()
					.map(n->String.valueOf(n))
						.filter(n->n.startsWith("2") || n.startsWith("-2"))
							.collect(Collectors.toList());
				System.out.println(numbersStartsWith);
	}

}
