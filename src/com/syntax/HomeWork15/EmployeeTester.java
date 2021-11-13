package com.syntax.HomeWork15;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee Asghar = new Employee();
		Asghar.empID = 123;
		Asghar.salary = 140000;

		System.out.println("Asghar's Employee ID: " + Asghar.empID);
		System.out.println("Asghar's Salary :" + Asghar.salary);
		System.out.println(Employee.CEO + " is CEO of the company Asghar work for");

		Employee Asel = new Employee();
		Asel.empID = 456;
		Asel.salary = 150000;
		System.out.println("Asel's Employee ID: " + Asel.empID);
		System.out.println("Asel's Salary :" + Asel.salary);
		System.out.println(Employee.CEO + " is CEO of the company Asel work for");

	}

}
