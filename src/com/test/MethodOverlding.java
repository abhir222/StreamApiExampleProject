package com.test;

public class MethodOverlding {

	public void m1(byte a, byte b) {
		System.out.println(a+b);
	}
	public void m1(short a, short b) {
		System.out.println(a-b);
	}
	public void m1(float a, float b) {
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) {

		MethodOverlding m = new MethodOverlding();
		m.m1(20,50);
	}
	
	

}
