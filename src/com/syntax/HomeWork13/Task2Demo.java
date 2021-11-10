package com.syntax.HomeWork13;

public class Task2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capital = "Bangkok";

		if (!capital.isEmpty() && capital.length() % 2 != 0 && capital.length() >= 3) {

			System.out.println(capital.charAt(capital.length() / 2));
		}

	}
}
