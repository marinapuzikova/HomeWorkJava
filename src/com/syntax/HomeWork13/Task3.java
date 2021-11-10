package com.syntax.HomeWork13;

public class Task3 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).

		String day = "Sunday";
		String newDay = "";
		for (int i = day.length() - 1; i >= 0; i--) { // -1 because the characters in the string are indexed from 0.
			newDay=newDay+day.charAt(i);

		}
		System.out.print(newDay);
	}

}
