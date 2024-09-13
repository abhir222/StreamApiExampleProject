package com.functionalinterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(25);
		al.add(55);
		al.add(2);
		System.out.println(al);
		Comparator<Integer> c = (I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(al, c);
		al.stream().forEach(System.out::println);
		List<Integer> collect = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(al);
		System.out.println(collect);
		String n = "Abhi"+7+8+9;
		System.out.println(n);
		
	}
}
//class MyComparator implements Comparator<Integer> {
//	public int compare(Integer I1, Integer I2) {
//		if (I1 < I2) {
//			return -1;
//		} else if (I1 > I2) {
//			return +1;
//		} else {
//			return 0;
//		}
//	}
//}
