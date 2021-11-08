package com.syntax.HomeWork12;

public class Student {
	/*
	 * Create class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score >80 -
	 * B score >70 - C score > 50 - D anything else - F
	 */
char getGrade(int score) {
	char studentGrade;
		if(score>90) {
		studentGrade = 'A';
	}else if(score>80) {
		studentGrade ='B';
	}else if(score>70) {
		studentGrade = 'C';
	}else if(score>50) {
		studentGrade = 'D';
	}else {
		studentGrade= 'F';
	}
		return studentGrade;
}
		
		}


