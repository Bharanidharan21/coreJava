package come.Bharani.collection.carTask;

import java.util.*;

public class userInterface {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Car car=new Car();
		int choice;
		while(true) {
			System.out.println("1.Add car");
			System.out.println("2.Search by name");
			System.out.println("3.Search by count");
			System.out.println(" 4.Total");
			System.out.println("5.Exit");
			System.out.println("Enter your choice/n");
			String input=scanner.nextLine().trim();
			if(!input.matches("[1-5]"))
				continue;
			choice=Integer.parseInt(scanner.nextLine());
			switch(choice) {
			case 1:
				System.out.println("Enter the car name/n");
				String name=scanner.nextLine();
				System.out.println("Enter no of cars sold/n");
				try {
					int count=Integer.parseInt(scanner.nextLine().trim() );
				
				int num=Integer.parseInt(scanner.nextLine());
				car.addCar(name, num);
				}
				break;
			case 2:
				HandleSearcByCount(scanner,car);
			
			}
		}
	}
}
