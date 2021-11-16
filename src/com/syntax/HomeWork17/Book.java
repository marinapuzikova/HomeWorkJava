package com.syntax.HomeWork17;

public class Book {
	/*
	 * Write Book class that will have instance variables and 2 Constructors. While
	 * creating an object make sure: Instance variables are being initialized Both
	 * Constructors are being executed
	 */
	private String bookName;
	private String bookAuthor;
	private int yearPrinted;
	
	public Book() {
		
	}
	public Book(String bookName, String bookAuthor,int yearPrinted) {
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.yearPrinted=yearPrinted;
	}
	public void displayInfo() {
		System.out.println("Book: "+bookName+" was writtent by "+bookAuthor+" in the year of "+yearPrinted);
	}
}
