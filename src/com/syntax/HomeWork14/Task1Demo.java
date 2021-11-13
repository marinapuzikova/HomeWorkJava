package com.syntax.HomeWork14;

public class Task1Demo {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 */
		String str="Today is a beautiful day";
		System.out.println(str.replace(" ",""));// changes are not made to original variable because strings are immutable
		str=str.replaceAll("\\s", ""); //we are reassigning value
		System.out.println(str);//we are still getting spaces in this statement because strings are immutable(unchangeable)
		
		
		//String class is immutable->means it can not be changed,once we declared smth it will always stays the same 
		//until we reassigned the value
		StringBuilder str2=new StringBuilder("Today is a beautiful day");
		System.out.println(str2.reverse());//Changes made to original variable in case of StringBuilder class
		System.out.println(str2);

		//StringBuilder class is mutable->means any changes that we are performing on the object(str2)
		//they will be reflected in the original variable(line18)
	}

}
