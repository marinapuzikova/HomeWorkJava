package com.syntax.HomeWork14;

public class Task7 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
		String str1="Hello";
		String str2="World";
		System.out.println("Before swapping: "+str1+" "+str2);
		str1=str1+str2;
		//extract str1 from updated str1
		str2=str1.substring(0,(str1.length()-str2.length()));
		//extract str1 from updated str1
		str1=str1.substring(str2.length());
		System.out.println("After swapping: "+str1+" "+str2);
	}

}
