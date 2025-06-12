package com.Bharani.EmployeeDetails;

public class FullTimeEmployee extends Employee {
	double monthlySalary;

	public FullTimeEmployee(int empId, String name, String department, double monthlySalary) {
		super(empId, name, department);
		this.monthlySalary = monthlySalary;
	}

	
	@Override
	public void DisplayDetails() {
		// TODO Auto-generated method stub
		System.out.println("----- Full-Time Employee Details -----");
		super.DisplayDetails();
		System.out.println("Monthly Salary:"+monthlySalary);
	}
	

}
