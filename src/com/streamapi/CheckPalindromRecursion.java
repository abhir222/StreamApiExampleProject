package com.streamapi;

import java.util.Scanner;

public class CheckPalindromRecursion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(reverseString(s.toLowerCase()));
		
	}

	static boolean reverseString(String s) {
		for(int i=0; i<s.length()-1; i++) {
			for(int j=s.length()-1; j>0; j--) {
				if(s.charAt(i) != s.charAt(j)) {
					return false;
				} else {
					return true;
				}
			}
		}
		return false;
	}

}
