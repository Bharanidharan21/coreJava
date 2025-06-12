package com.Bharani.EmployeeDetails;

public class Employee {
	int empId;
	String name;
	String department;
	public Employee(int empId,String name,String department) {
		super();
		this.empId=empId;
		this.name=name;
		this.department=department;
	}
	
	


	public void DisplayDetails() {
		System.out.println("ID:"+empId);
		System.out.println("Name:"+name);
		System.out.println("Department:"+department);
		
	}


}
