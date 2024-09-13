package com.streamapi;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		  String str1 = "CAR"; 
		  System.out.println("Original string: "+str1); 
		  int n = str1.length(); // caclulates length of String
		  
		  String Reverse_String =""; 
		  char ch; 
		  for(int i=0;i<n;i++) { 
			  //fetch each character 
			  ch = str1.charAt(i); 
		  System.out.println(ch); 
		  //concatenates each character in front of the new string 
		  Reverse_String = Reverse_String + ch; 
		  }
		  System.out.println("Reversed string: "+Reverse_String); // Display the reversed String   
		  
		 
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(reverseString(s, Reverse_String , s.length()-1));
		
		}
		static String reverseString(String s, String r, int i) {
		if(i < 0) {
			return r;
			
		}
		return reverseString(s, r+s.charAt(i), i-1);
	}

}
