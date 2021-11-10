package com.syntax.HomeWork14;

public class Task5 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?
		String words = "Today is Wednesday";
		String reversedString = "";
		String[] arr = words.split(" ");

		for (int j = arr.length - 1; j >= 0; j--) {
			reversedString = reversedString + arr[j] + " ";
		}

		System.out.print("Reversed string : " + reversedString);
	}

}
