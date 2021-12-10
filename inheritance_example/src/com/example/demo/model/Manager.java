package com.example.demo.model;

import com.example.demo.Employee;

public class Manager extends Employee {
	private String[] skillSet;

	/**
	 * @param employeeId
	 * @param employeeName
	 * @param designation
	 * @param salary
	 * @param skillSet
	 */
	public Manager(int employeeId, String employeeName, String designation, double salary, String[] skillSet) {
		super(employeeId, employeeName, designation, salary);
		this.skillSet = skillSet;
	}

	/**
	 * @param j 
	 * @param string2 
	 * @param string 
	 * @param i 
	 * 
	 */
	public Manager() {
		super();
		
	}

	public String[] getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	
//	public String hello{
//		return "hi";
//	}
//	
	
	

}
