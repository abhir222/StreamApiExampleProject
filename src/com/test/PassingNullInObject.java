package com.test;

public class PassingNullInObject {

	public String m3() {
		System.out.println("this is method");
		return "";
	}
	
	
	public static void main(String[] args) {

		PassingNullInObject p = null;
		p.m3();
	}

}
