package com.syntax.HomeWork17Demo;

import com.syntax.HomeWork17.Task03Person;

public class Task03TesterDemo {

	public static void main(String[] args) {
		// initialization through public constructor
Task03Person person1 = new Task03Person("John", "Smith", 35);
person1.printName();

//initialization through default constructor impossible to access class from dif package
//Task03Person person2 = new Task03Person("John");

}
	}


