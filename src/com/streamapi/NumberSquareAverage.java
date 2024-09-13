package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {

		//1,100,400,900,225
		//400,900,225
		//1525/3 = 508.
		
		List<Integer> list = Arrays.asList(1,10,20,30,15);
		double squarAvg = list.stream()
				.map(n->n*n)
					.filter(n->n>100)
						.mapToInt(n->n)
							.average()
								.getAsDouble();
		System.out.println(squarAvg);
	}

}
