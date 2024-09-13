package com.functionalinterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
//		Sample sample= new SampleImpl();
//		sample.moveCar();
		Sample sample=(a,b)->{
			System.out.println(a+"     "+b);
			System.out.println("This method is called using the funcitonality of the Lambda Expression");
		};
		sample.moveCar(30,70);
		sample.stopCar();
		Runnable runable=()->{
			System.out.println("This is from Runnable interface");
		};
		runable.run();
		
	}

}
