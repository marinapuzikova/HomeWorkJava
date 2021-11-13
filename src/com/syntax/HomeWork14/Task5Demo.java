package com.syntax.HomeWork14;

public class Task5Demo {

	public static void main(String[] args) {
		// 4.How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever

		String str = "This is sentence i want to reverse";
		String[] strArr = str.split(" ");

		for (String word : strArr) {
			StringBuilder stringBuilder = new StringBuilder(word);
			System.out.print(stringBuilder.reverse() + " ");
		}

	}

}
