package com.streamapi;

import java.util.Scanner;

public class CheckPelindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		boolean result = isPalindrome(s.toLowerCase());
		System.out.println(result);
		
	}

	static boolean isPalindrome(String inputString) {

		int start = 0;
		int end = inputString.length()-1;
		
		while(start < end) {
			if(inputString.charAt(start) != inputString.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	
	}

}
