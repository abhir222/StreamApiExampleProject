package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestingConcept {

	public static void main(String[] args) {
		System.out.println("Hello");
		List<Integer> list = new ArrayList<Integer>();
		list.add(60);
		list.add(21);
		list.add(21);
		list.add(21);
		list.add(21);
		
		list.add(31);
		list.add(2);
		list.add(780);
		list.add(222);
		System.out.println(list);
		List<Integer> filteredList = list.stream().filter(x-> x%2 == 0).collect(Collectors.toList());
		System.out.println(filteredList);
		System.out.println("Sorted Data");
		List<Integer> sortedData = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("stream object sorted"+sortedData);

		List<Integer> distinctSortedData = list.stream().distinct().sorted().collect(Collectors.toList());
		List<Integer> distinctSortedDataDesc = list.stream().distinct().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		
		System.out.println("stream object distinct sorted data"+distinctSortedData);
		System.out.println("stream object distinct sorted data in descending order"+distinctSortedDataDesc);
		
		List<Integer> sortedData1 = list.stream().distinct().map(x->{
			x=x+7;
			return x;
		}).sorted().toList();
		
		System.out.println("After Modification(added 7 in each element) For Map Method:"+sortedData1);
				
				
				
				
			
				
				
	}

}
