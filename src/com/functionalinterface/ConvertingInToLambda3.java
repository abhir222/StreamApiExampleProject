package com.functionalinterface;

public class ConvertingInToLambda3 {

	public static void main(String[] args) {

		Interf2 d = n -> n*n;
		System.out.println(d.squarIt(5));

	}

}

interface Interf2 {
	public int squarIt(int n);
}

/*
 * class Demo implements Interf2 { public void squarIt(int n) {
 * System.out.println("Square of " + n * n); } }
 */