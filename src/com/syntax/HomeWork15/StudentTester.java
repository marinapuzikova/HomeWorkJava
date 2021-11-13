package com.syntax.HomeWork15;

public class StudentTester {

	public static void main(String[] args) {
		Students s1=new Students();
		s1.studentName="Marina";
		s1.studentId=86;
		s1.numberOfStudents++;
		
		
		Students s2=new Students();
		s2.studentName="Mike";
		s2.studentId=345;
		s2.numberOfStudents++;
		

		Students s3=new Students();
		s3.studentName="Alex";
		s3.studentId=31;
		s3.numberOfStudents++;
		
		System.out.println("Total number of the students is "+Students.numberOfStudents);
	}

}
