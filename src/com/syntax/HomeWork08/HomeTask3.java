package com.syntax.HomeWork08;

import java.util.Scanner;

public class HomeTask3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers
		 */
		int start;
		int end;
		int eSum = 0;
		int oSum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start number:");
		start = scan.nextInt();
		System.out.println("Please enter end number:");
		end = scan.nextInt();
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				eSum += i;
			} else {
				oSum += i;
			}
		}
		System.out.println("The sum of even numers is " + eSum);
		System.out.println("The sum of Odd numbers is " + oSum);
	}

}
