package com.Test;
public class Employee {
	
	String name;
	private String designation;
	private double salary;
	private String gender;
	public String insuranceScheme;
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(String name, String designation,String gender, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.gender =gender;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		this.insuranceScheme =this.calculateInsurance(salary);
		
		
	}
	private String calculateInsurance(double salarys) {
		
		if(salary>5000 && salary <20000) {
			return "scheme-c";
		}
		if(salary>=20000 && salary <40000) {
			return "scheme-b";
		}
		if(salary>=40000) {
			return "scheme-a";
		}
		
		return "no scheme";
	}
	

}
