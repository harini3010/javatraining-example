package com.training;

public class Book {
	private String authorName;
	private  int bookId;
	private  double price;
	/**
	 * 
	 */
//	it is 0 argument
	public Book() {
//     super(); Either super or this only applicable if we put both it never  because super/this should be first
	   this("darsh",102,450.00);
//		if we highlight the this and f3 it will show the particular book
//		overloaded constructor this() can be apply
//		super(); this takes to the object class file
		
	}
	/**
	 * @param authorName
	 * @param bookId
	 * @param price
	 */
//	it is parameterized constructor
	public Book(String authorName, int bookId, double price) {
		super();
//		this.authorName refers to the field private string authorName
//      authorName refers to the method argument authorName
//		"this" refer to current instance
		this.authorName = authorName;
		this.bookId = bookId;
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
