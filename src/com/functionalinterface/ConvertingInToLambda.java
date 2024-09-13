package com.functionalinterface;

public class ConvertingInToLambda {

	public static void main(String[] args) {

		Interf d = ()->System.out.println("Hello...By using lambda expression");
		d.m1();

	}
}

interface Interf {
	public void m1();
}

/*
 * class Demo implements Interf { public void m1() {
 * System.out.println("Hello...1"); } }
 */
