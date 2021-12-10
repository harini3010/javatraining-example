package com.training;

public class BookApplication {

	public static void main(String[] args) {
//		its a 0 argument constructor
		Book headFirst = new Book();

		
		headFirst.setBookId(101);
     	headFirst.setAuthorName("Kathy Sieera");
		headFirst.setPrice(450.00);
		
		System.out.println(headFirst.getBookId());
		System.out.println(headFirst.getAuthorName());
		System.out.println(headFirst.getPrice());
		
//		its a all parameterized argument constructor
		
		Book effJava = new Book("Effective java",102,560.00);
		
		System.out.println(effJava.getBookId());
		System.out.println(effJava.getAuthorName());
		System.out.println(effJava.getPrice());
	}

}
