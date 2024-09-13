package com.test;

public class RemovesWhiteSpaces {

	public static void main(String[] args) {

		String s = "this is  space between  the    words";
		String stringWithOutSpace = "";
		stringWithOutSpace = s.replaceAll("\\s", "");
		System.out.println(stringWithOutSpace);
		
		System.out.println("--------------------------------------");
		
		//another approach
		String stringWithSpace = "this is  space between the    words of version 2";
				
		char[] c = stringWithSpace.toCharArray();
		String stringWithoutScape = "";
		for(int i=0; i<c.length; i++) {
			if((c[i] != ' ') && (c[i] != '\t')) {
				stringWithoutScape = stringWithoutScape + c[i];
			}
		}
		System.out.println(stringWithoutScape);
	}

}
