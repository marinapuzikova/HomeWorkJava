package com.syntax.HomeWork14;

public class Task2Demo {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String. alpha
		 * is short for Alpha numeric
		 */
		String str = "kbfbjkdbfASDHBDH123*()";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "")); // first i'm removing all special characters
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());// ( ^ means not) after i removed special
																		// characters with nothing "" ,i'm calling
																		// method length

	}

}
