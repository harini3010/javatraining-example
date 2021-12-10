package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.model.Invoice;
import com.example.demo.services.EmployeeService;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
//		using wrapper class , parsing the string representation to respective types
//		this in can be called by parse called wrapper class and for 12 and 15 it can be changed to string so we use prase 
//		but for 13 and 14 ling string called directly
		
		int emploeeid = Integer.parseInt(args[0]); 
		
		String employeeName = args[1];
		
		String designation = args[2];
		
		double salary = Double.parseDouble(args[3]);
		
		Employee ram = new Employee(100, "ramesh", "developer", 50000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id");
			int empId =sc.nextInt();
		System.out.println("Enter the Employee Name");
			String empName = sc.next();
		System.out.println("Enter the Employee Designation");
			String desig = sc.next();
		System.out.println("Enter the Employee salary");
			double empSal = sc.nextDouble();
		
		Employee shyam = new Employee(101, "rajesh", "tester", 60000); 
		
		sc.close();

		//		calling the overload methods
		EmployeeService service = new EmployeeService();
		
		System.out.println("Excepted: 15000 => Actual:=" +service.calculateBonus(ram));
		
		System.out.println("excepted: 18000 => Actual:=" +service.calculateBonus(shyam.getSalary()));

//		overloaded method with autoboxing	
// Double is casting type wrapper class 
		
		Double salary2 = Double.valueOf(50000);
		
		int intSalary2 = (int) (salary2.doubleValue());
		
		double salary3 =  salary2.doubleValue();
		
		int salary4 = (int) salary3;
		
		
		System.out.println("Excepted 16000 => Actual:=" +service.calculateBonus(salary2));
		

// pass by value
		
		Employee rakesh = new Employee(105, "rakesh", "manager", 70000);
//		
     	System.out.println("Before:="+rakesh.getSalary()); 
//		
		service.updateSalary(rakesh);
//		
		System.out.println("After:="+rakesh.getSalary());
//		
		System.out.println("Excepted: 90000 => Actual:=" +rakesh.getSalary());
		
		
		Invoice.showAll();
//		Invoice.showall2();
		sc.close();
			

	}

}
