package com.example.demo;
import com.example.demo.model.*;

public class Application {
	public static void main(String[] args) {
		Employee ram = new Employee(101,"ramesh","manager",65000);
		
		String[] skills= {"java","dotnet","testing","mainframe"};
		
		Manager mgr = new Manager(102,"suresh","Manager",75000,skills);
		
		System.out.println(ram); // this output for employee 
//		System.out.println(ram.hello()); can't access superclass from sub class
		
//	but for in Manager it is in subclass
		System.out.println(mgr.getEmployeeId());
		System.out.println(mgr.getEmployeeName());
		System.out.println(mgr.getDesignation());
		System.out.println(mgr.getSalary());
//		this is for skill
		
		for(String eachSkill:mgr.getSkillSet())
		System.out.println(eachSkill);
		
//	for creating a array for employee
	Employee[] emp = new Employee[3];
	Employee e1= new Employee(100, "ram", "tester", 8000);
	Employee e2 = new Employee(101, " suresh","Hr",5000);
	Employee e3 = new Employee(102, "anu"," manager",7000);
	emp[0]=e1;
	emp[1]=e2;
	emp[2]=e3;
	
	EmployeeService service = new EmployeeService();
	service.printEmployees(emp);
	}
// for another method for creating employee
//	
	
//	EmployeeService service = new EmployeeService();
//	
//	Manager mgr1 = new Manager(102,"sandy","Manager",75000,skills);
//	Manager mgr2 = new Manager(102,"madhu","trainee",56000,skills);
//    Employee[] emplList = {mgr1,mgr2};
//	service.printEmployees(emplList);

}

