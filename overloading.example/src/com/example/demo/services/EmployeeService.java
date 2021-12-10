package com.example.demo.services; 
import com.example.demo.model.*;

public class EmployeeService {
	
//	DRY(don't repeat yourself) principle followed
	public double  calculateBonus(Employee employee) {
		return calculateBonus(employee.getSalary());
	}
//	overloaded method has same name but different argument
//	same name (calculateBonus ) diff argument(employee double()
	public double calculateBonus(double salary) {
		return salary *.30;
	}
	
//	overloaded method with autoboxing
	
	public double calculateBonus(Double salary) {
		return (salary *0.30) + 1000;
	}
//	pass by value
	public Employee  updateSalary(Employee employee) {
		double updateSalary = employee.getSalary()+20000;
//		 20000 is we given because it is primitive so we give the value directly 
		employee.setSalary(updateSalary);
		return employee;
		
	}

}
