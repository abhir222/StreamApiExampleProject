package com.test;

import java.util.HashMap;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {

		// How to reverse a string in Java?
		// input - Java
		// output - avaj

		String inputString = "java is programming language";
		char[] c = inputString.toCharArray();
		// [j,a,v,a]
		String outputString = "";
		for (int i = c.length - 1; i >= 0; i--) {
			outputString = outputString + c[i];
			// a=""+a
			// av=a+v
			// ava=av+a
			// avaj=ava+j
		}
		System.out.println(outputString);

		String[] word = inputString.trim().split("\\s");
		String s1 = "";
		for (int i = word.length - 1; i >= 0; i--) {
			s1 = s1 + word[i] + " ";
		}
		System.out.println(s1);

		String[] stringWithSpace = inputString.split("\\s");
		String stringWithoutSpace = "";
		for (String string : stringWithSpace) {
			stringWithoutSpace = stringWithoutSpace + string;
		}
		System.out.println(stringWithoutSpace);

		// by applying condition removing white spaces
		char[] inputArray = inputString.toCharArray();
		String output = "";
		for (int i = 0; i < inputArray.length; i++) {
			if ((inputArray[i] != ' ') && (inputArray[i] != '\t')) {
				output = output + inputArray[i];
			}
		}
		System.out.println(output);
		
		//find duplicates
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		String input2 = "java";
		char[] charArray = input2.toCharArray();
		for(char ch : charArray) {
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch)+1);
			}else {
				charCount.put(ch, 1);
			}
		}
		System.out.println(charCount);
		Set<Character> keySet = charCount.keySet();
		for(char ch2:keySet) {
			if((charCount.get(ch2))>1){
				System.out.println(ch2+" : "+charCount.get(ch2));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		char[] charArray2 = inputString.toCharArray();
		for(int i=charArray2.length-1; i>=0; i--) {
			sb.append(charArray2[i]);
		}
		System.out.println(sb);
	}

}
