package com.syntax.HomeWork13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 */
Scanner scan=new Scanner(System.in);
String momName="Mary";
String dadName="Daniel";
String babyGender;
System.out.println("Please enter your baby gender:");
babyGender=scan.nextLine();
System.out.println("Suggested baby name for "+babyGender+" is:");
if (babyGender.equalsIgnoreCase("boy")) {
	System.out.println(dadName.toUpperCase().substring(0,3)+momName.toUpperCase().substring(2,4));
	
}else {
	System.out.println(momName.toUpperCase().substring(0,3)+dadName.toUpperCase().substring(3,6));
}

	}

}
