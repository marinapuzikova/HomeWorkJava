package com.syntax.HomeWork14;

public class Task4 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
		String str = "Today is Wednesday";
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);

		}
		System.out.println(str1);
	}
}
