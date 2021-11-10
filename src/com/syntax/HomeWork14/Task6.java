package com.syntax.HomeWork14;

public class Task6 {

	public static void main(String[] args) {

		// How would you check if String is palindrome or not?
		// A String is said to be Palindrome if it is equal to itself in reverse order.

		String str = "kayak";
		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		if (str.equals(str1)) {
			System.out.println("string " + str + " is polindrom");
		} else {
			System.out.println("string " + str + " is not polindrom");
		}

	}
}
