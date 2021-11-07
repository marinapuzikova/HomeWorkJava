package com.syntax.HomeWork11;

public class Dog {
	/*
	 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador with specific attributes and behaviors.
	 */

	String breed;
	String color;
	double height;
	String food;
	int age;

	void bark() {
		System.out.println(color + " " + breed + " " + height +"'"+ " and " + age + " years old" + " can bark very loud");
	}

	void eat() {
		System.out.println(color + " " + breed + " " + height +"'"+ " and " + age + " years old" + " " + " can eat " + food+" food");

	}

	public static void main(String[]args) {
	 Dog Husky=new Dog();
	 Husky.breed="Siberian Husky";
	 Husky.color="gray";
	 Husky.height=22.5;
	 Husky.age=5;
	 Husky.food= "healthy raw";
	 
	 Dog Bulldog=new Dog();
	 Bulldog.breed="English Bulldog";
	 Bulldog.color="brown";
	 Bulldog.height=12.5;
	 Bulldog.age=4;
	 Bulldog.food= "homemade";
	 
	 Dog Labrador=new Dog();
	 Labrador.breed="Labrador Retriever";
	 Labrador.color="light brown";
	 Labrador.height=24;
	 Labrador.age=6;
	 Labrador.food= "homemade";
	 
	 Husky.eat();
	 Labrador.bark();
	 Bulldog.eat();
	}

}
