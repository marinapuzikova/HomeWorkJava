package com.syntax.HomeWork14;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 */
		String str = "456732fghj$$$$*****";//loops are very slow to perform,but we can use them to solve this task
		int numOfLetters = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				numOfLetters++;
			}
		}
		System.out.println(numOfLetters);
	}

}
