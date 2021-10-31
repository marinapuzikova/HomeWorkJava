package com.syntax.HomeWork08;

import java.util.Scanner;

public class HomeTask2 {

	public static void main(String[] args) {
		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon you get “yes” from a user program should stop asking.
		 */
		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Do you need a credit card?");
			answer = scan.next();

		} while (answer.equalsIgnoreCase("no"));
		System.out.println("Thank you for choosing our bank!");
	}
}
