package com.Bharani.endoment;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Endowment endowment =null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Endowment Id");
		String id = sc.nextLine();
		
		System.out.println("Enter Holder Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Endowment Type");
		String type = sc.nextLine();
		
		if(type.equalsIgnoreCase("Educational") || type.equalsIgnoreCase("health"))
		{
			
			
			
			
			System.out.println("Enter Registration Date");
			String regDate = sc.nextLine();
			
			
			if(type.equalsIgnoreCase("Educational") )
			{
				System.out.println("Enter Educational Institution");
				String institution = sc.nextLine();
				
				System.out.println(" Enter Educational Division");
				String division = sc.nextLine();
				
				endowment = new EducationalEndowment(id, name, type, regDate, institution, division);
				System.out.printf("Endowment Amount %.2f",endowment.calculateEndowment());
				
			}
			else
			{
				System.out.println("Enter Health Care Center");
				String healthCare=sc.nextLine();
				System.out.println("Enter Holder Age");
				int age=Integer.parseInt(sc.nextLine());
				
				endowment= new HealthEndowment(id, name, type, regDate, healthCare, age);
			
				
				System.out.printf("Endowment Amount %.2f",endowment.calculateEndowment());
			
			}
		
			
		}
		else
		{
			System.out.println(type+" is an invalid endowment type");
			
			
		}
		
	
		
		
		
	}


}
