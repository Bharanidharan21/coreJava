package com.Bharani.EmployeeDetails;

public class EmployeeDetails {
	public static void main(String[]args) {
		PartTimeEmployee pte=new PartTimeEmployee(201, "Bharani", "CSE", 12, 100);
		FullTimeEmployee fte=new FullTimeEmployee(104, "Dharun", "ECE", 15000);
		pte.DisplayDetails();
		fte.DisplayDetails();
	}
}
