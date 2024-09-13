package constructorconcept;

import java.util.Arrays;

public class MiniumElementNotInArray {

	public static void main(String[] args) {
		/*
		 * int[] myArray = {2,4, 6, 8};
		 * 
		 * // Find the minimum value not present in the array int minNotInArray =
		 * findMinNotInArray(myArray);
		 * 
		 * System.out.println("The minimum value not present in the array is: " +
		 * minNotInArray); }
		 * 
		 * static int findMinNotInArray(int[] array) { // Sort the array (if it's not
		 * already sorted) Arrays.sort(array);
		 * 
		 * // Initialize a variable to store the minimum value not present in the array
		 * int minNotInArray = 0;
		 * 
		 * // Iterate through the array for (int i = 0; i < array.length; i++) { // If
		 * the current array element is equal to or less than minNotInArray, update //
		 * minNotInArray if (array[i] <= minNotInArray) { minNotInArray = array[i] + 1;
		 * } }
		 * 
		 * return minNotInArray; }
		 */
		String str="Hellow";
		char[] charArray = str.toCharArray();
		StringBuilder newStringg= new StringBuilder(str) ;
		System.out.println(newStringg.reverse());
		
		String[] split = str.split(" ");
		
		
	}

}
