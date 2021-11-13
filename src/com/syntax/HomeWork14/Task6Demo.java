package com.syntax.HomeWork14;

public class Task6Demo {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?
		String str = "Racecar";
		StringBuilder strB = new StringBuilder(str);
		strB.reverse();
		if (str.equalsIgnoreCase(strB.toString())) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}

	}

}