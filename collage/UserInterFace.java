package com.Bharani.collage;

import java.beans.IntrospectionException;
import java.util.*;



public class UserInterFace {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		Student student=null;
		double totalFee=0;
		System.out.println("Enter Student Id");
		int studentId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student name");
		String studentName=sc.nextLine();
		System.out.println("Enter Department name");
		String Department=sc.nextLine();
		System.out.println("Enter gender");
		String gender=sc.nextLine();
		System.out.println("Enter category");
		String category=sc.nextLine();
		if(category.equalsIgnoreCase("Hosteller")) {
			System.out.println("Enter the room number");
			int roomNumber=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the block name");
			char blockName=sc.nextLine().charAt(0);
			System.out.println("Enter the room type");
			String roomType=sc.nextLine();
			student=new Hosteller(studentId, studentName, Department, gender, category, studentId, roomNumber, blockName, roomType);
			totalFee =student.calculateTotalFee();
		
			
			
		}
		else if(category.equalsIgnoreCase("Dayscholler")) {
			System.out.println("Enter College fee");
			double collegeFee=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Bus number");
			int busNumber=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the distance");
			int distance=sc.nextInt();
			student=new DayScholar(studentId, studentName, Department, gender, category, collegeFee, busNumber, distance);
			totalFee=student.calculateTotalFee();
			
			
		}
		System.out.println("fees Amount is "+totalFee);
		//System.out.println("Enter Bus number");
		//System.out.println("Enter the distance");
		//System.out.println("");

	}

}
