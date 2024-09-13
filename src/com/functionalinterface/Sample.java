package com.functionalinterface;

@FunctionalInterface
public interface Sample {

	public abstract void moveCar(int a,int b);
	public default void stopCar() {
		System.out.println("This statement is from Default Method");
	}
}
