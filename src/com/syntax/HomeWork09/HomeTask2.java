package com.syntax.HomeWork09;

public class HomeTask2 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 6 elements into it. Using 2 different
		 * loops print all elements from the array.
		 */
		String[] animals = { "Cat", "Dog", "Horse", "Monkey", "Elephant", "Lion" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		//advanced for loop:
		System.out.println("*****************************************");
		for (String animal : animals) {
			System.out.println(animal);
		}
	}
}
