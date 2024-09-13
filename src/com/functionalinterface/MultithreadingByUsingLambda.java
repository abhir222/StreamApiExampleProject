package com.functionalinterface;

public class MultithreadingByUsingLambda {

	public static void main(String[] args) {

		Runnable r = ()-> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread-1");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thead-1");
		}
	}
}

/*
 * class MyRunnable implements Runnable { public void run() { for (int i = 0; i
 * < 10; i++) { System.out.println("Child Thread"); } } }
 */