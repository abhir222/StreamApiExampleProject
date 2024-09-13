package com.test;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

		String s = "this input";
		char[] c = s.toCharArray();
		System.out.println(c.length);
		int count;
		for(int i=0; i<c.length; i++) {
			count = 1;
			for(int j=i+1; j<c.length; j++) {
				if(c[i]==c[j] && c[j] !=' ') {
//					System.out.print(c[j]+" ");
					count++;
					c[j] = '0';
				}
			}
			if(count>1 && c[i]!='0') {
				System.out.println(c[i]);
			}
		}
		
		//find duplicates
				HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
				String input2 = "this is input";
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
		
	}
}
