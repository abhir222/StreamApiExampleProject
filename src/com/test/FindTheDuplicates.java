package com.test;

import java.util.HashMap;
import java.util.Set;

public class FindTheDuplicates {

	public static void main(String[] args) {

		HashMap<Character, Integer> charCount = new HashMap<>();
		String inputString = "JavaJ2EE";
		//converting string object into character array
		char[] charArray = inputString.toCharArray();
		//checking a particular character 
		for(char c : charArray) {
			//checking that is character is already in a map so in increase the count 
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}else {
				// otherwise return 1
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount);
		
		Set<Character> keySet = charCount.keySet();
		
		for(Character ch : keySet) {
			if(charCount.get(ch)>1) {
				System.out.println(ch+" : "+charCount.get(ch));
			}
		}
	}

}
