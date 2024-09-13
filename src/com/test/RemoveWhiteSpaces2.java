package com.test;

public class RemoveWhiteSpaces2 {

	public static void main(String[] args) {

		//How do you remove all white spaces from a string in Java?
		
		String inputString = " this is example with    white     spaces  ";
		String[] stringWithoutSpace = inputString.trim().split("\\s");
		String outputString = "";
		for(String s: stringWithoutSpace) {
			outputString = outputString + s;
			System.out.println(s);
		}
		System.out.println(outputString);
		
	}

}
