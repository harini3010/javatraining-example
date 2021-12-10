package com.example.demo.model;
import static java.lang.Math.*;

public class Invoice {
//	while declaring a constant = note it in all caps
	public static final int STARTNUMBER = 100;
	

	private int invoiceNumber; //instance variable
	private static double discount;    // static or class variable
	/*
	 * instance method can access both instance and static variable
	 */
	public void show() {
		System.out.println(invoiceNumber);
		System.out.println(discount);
		showAll();
		}
		
		/*
		 * static method can access only a "STATIC VARIABLE" but it cannot access the instance varible
		 */
		public static void showAll() {
			//System.out.println(invoiceNumber);
			System.out.println(discount);
//			show();
			
			
//			since static import is used , we are not calling the methods with class name
			System.out.println(sqrt(4));
			double radian30 = toRadians(30);
			double radian60 = toRadians(60);
			System.out.println(sin(radian30));
			System.out.println(cos(radian60));
			
			}

		
		
}	


