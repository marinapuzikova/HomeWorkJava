package com.syntax.HomeWork13;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
		String capital = "Bangkok";
		int length = capital.length();
		int middle = length / 2;
		char midCharacter = capital.charAt(middle);
		if (!capital.isEmpty()) {
			if (capital.length() % 2 != 0) {
				if (capital.length() >= 3) {
					System.out.println(midCharacter);
				}
			} else {
				System.out.println("String has even number of characters");
			}
		}
	}
}
