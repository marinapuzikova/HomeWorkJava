package com.syntax.HomeWork12;

public class Hello {
	/*
	 * Create a method that will say Hello in different language based on the
	 * country that will passed when method is executed.
	 */
	void writeHello(String country) {//(can be void and String method
		switch (country) {
		case "USA":
			System.out.println("Hello");
			break;
		case "Mexico":
			System.out.println("Hola");
			break;
		case "Russia":
			System.out.println("Privet");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
