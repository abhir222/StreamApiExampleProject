package com.functionalinterface;

import java.util.function.Predicate;

public class PredefineFunctionalInterfaceDemo {

	public static void main(String[] args) {
		String s = "Hello from java world";

		Predicate<Integer> lesserthan = i -> (i < 18);

		System.out.println(lesserthan.test(60));

		Predicate<String> p2 = str -> str.length() > 7;
		System.out.println("String Length Output:" + p2.test(s));
		Predicate<Product> p3 = pr -> pr.getPrice() > 90;
		System.out.println("Prouduct Output:" + p3.test(new Product(1, "Abhisek", 1000)));

	}

}
