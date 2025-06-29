package come.Bharani.collection.task3;

import java.util.Scanner;

public class UserInterface1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumAvg na=new NumAvg();
		int choice;
		int number;
		while(true) {
		System.out.println("1.Add number");
		System.out.println("2.Find average");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		choice=Integer.parseInt(scanner.nextLine());
		
		switch (choice) {
		case 1:
			System.out.println("Enter the number");
			number=Integer.parseInt(scanner.nextLine());
			na.addNum(number);
			break;
		case 2:
			if(na.getNumSet().isEmpty()) {
				System.out.println("The set is empty");
			}
			else {
				System.out.println(na.calAvg());
			}
			break;
		case 3:
			System.out.println("Thank you for using the application");
			return;
			default:
				System.out.println("invalid choice");
		}
		
		}
		
		
	}

}
