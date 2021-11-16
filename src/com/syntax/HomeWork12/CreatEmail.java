package com.syntax.HomeWork12;

public class CreatEmail {
	/*
	 * Create a method createEmail(). Based on values of users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * createEmail(John, Snow, gmail) → johnsnow@gmail.com or
	 */
	// it says that we have to return smth means we cant use void!!!
	String generateEmail(String firstName, String lastName, String emailType) {
		return firstName + lastName + emailType;

	}
}
