package com.functionalinterface;

public class ConvertingInToLambda2 {

	public static void main(String[] args) {
		Interf1 d  = (a,b)-> System.out.println("The sum "+(a+b));
		d.add(10, 20);
		d.add(100, 200);
		d.add(1000, 2000);
	}

}

interface Interf1{
	public void add(int a, int b);
}

/*
 * class Demo implements Interf1{ public void m1(int a, int b) {
 * System.out.println("The sum "+(a+b)); } }
 */