package com.streamapi;

import java.util.HashMap;

public class CheckPalindromeUsingHashMap {

	public static void main(String[] args) {
		
		String s = "malayalama";
		boolean result = isPalindrome(s.toLowerCase());
		System.out.println(result);
	}

	static boolean isPalindrome(String input) {
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for(char c : input.toCharArray()) {
			charCount.merge(c, 1, Integer::sum);
		}
		
		int oddCount = 0;
		for(int count : charCount.values()) {
			if(count % 2 != 0) {
				oddCount++;
			}
		}
		return oddCount <= 1;
	}
}
