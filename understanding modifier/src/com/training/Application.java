package com.training;

public class Application {

	public static void main(String[] args) {
		Student ram = new Student();
		

		//System.out.println(ram.firstName); //can't access firstName because it has marked as private
		
		System.out.println(ram.fees); //can access fees because its marked has default(package )
		
		

	}

}
