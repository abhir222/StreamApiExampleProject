package com.test;

public class ReverseSentance {

	public static void main(String[] args) {

		// this is to reverse the string

		String s = "Java is a programming language";
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {

			System.out.print(c[i]);
		}
		System.out.println("\n-----------------------------------------");
		// this is to reverse the sentence

		String inputString = "Java is a programming language";
		String[] word = inputString.split("\\s");
		String outputString = "";
		for (int i = word.length - 1; i > 0; i--) {
			outputString = outputString + word[i] + " ";
		}
		System.out.println(outputString);
	}

}
