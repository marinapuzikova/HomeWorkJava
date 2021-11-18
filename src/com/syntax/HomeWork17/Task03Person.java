package com.syntax.HomeWork17;

public class Task03Person {
	/*
	 * Write a java class that have 4 constructors with 4 different access levels of
	 * constructors(private,public,default,protected) and create 4 objects of this
	 * class: 1 - inside same class; 2 - from outside the class; 3 - from different
	 * class inside different package and observe result.
	 */

	private String firstName;
	private String lastName;
	private int age;
			//these are different access level of constructors:
	private Task03Person() {//private

	}

	Task03Person(String firstName) {//default
		this.firstName = firstName;
	}

	protected Task03Person(int age) {
		this.age = age;
	}

	public Task03Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void printName() {
		System.out.println(firstName + " " + lastName+" "+age+" years old");
	}

	public void setAge(int age) {
		if (age < 0 || age > 150) {
			System.out.println("Input is incorrect");
			return;
		}
		this.age = age;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void instance() {
		Task03Person person = new Task03Person();
		person.firstName = "John";
		person.lastName = "Smith";
		
		person.printName();
	}
}
