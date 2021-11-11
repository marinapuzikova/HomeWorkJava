package com.syntax.HomeWork14;

public class Task1Demo {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 */
		String str="kbfbjkdbfASDHBDH123*()";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
	}

}
