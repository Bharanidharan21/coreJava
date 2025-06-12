package com.Bharani.EmployeeDetails;

public class PartTimeEmployee extends Employee {
	int hoursWorked;
	double hourlyRate;
	public PartTimeEmployee(int empId, String name, String department, int hoursWorked, double hourlyRate) {
		super(empId, name, department);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public void DisplayDetails() {
		// TODO Auto-generated method stub
		System.out.println("----- Part-Time Employee Details -----");
		super.DisplayDetails();
		System.out.println("Hours Worked:"+hoursWorked);
		System.out.println("Hourly Rate:"+hourlyRate);
		System.out.println("Total Pay:"+(hoursWorked+hourlyRate));
		
	}
	

}
