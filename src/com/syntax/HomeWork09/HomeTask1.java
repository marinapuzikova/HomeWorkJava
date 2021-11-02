package com.syntax.HomeWork09;

public class HomeTask1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */
		String[] cars= {"BMD","Toyota","Tesla","Ford","Audi","Honda"};
	
		for (int i=0; i <cars.length; i++ ) {
			System.out.println(cars[i]);
		}
		
		//advanced for loop:
		System.out.println("*****************************************");
		for (String car: cars) {
			System.out.println(car);
		}
	}

}
