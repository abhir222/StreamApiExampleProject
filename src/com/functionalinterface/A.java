package com.functionalinterface;

public interface A {

	public void m1();

	A a = new A() {
		public void m1() {
			System.out.println("ab");
		}
	};
}