package com.syntax.HomeWork17;

public class Task03PersonTester {

	public static void main(String[] args) {

		// initialization through public constructor
		Task03Person person1 = new Task03Person("John", "Smith", 38);
		person1.printName();

		// initialization through default constructor
		Task03Person person2 = new Task03Person("Alex");

		person2.setLastName("White");

		person2.printName();
		person2.instance();
		// initialization through protected constructor
		Task03Person person3 = new Task03Person(33);

		person3.printName();

	}

}
