package come.Bharani.collection.tesk;

import java.util.Scanner;

public class UserInterface3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Products products=new Products();
		int choice;
		do {
		System.out.println("1.Add");
		System.out.println("2.Display");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
	    choice=Integer.parseInt(scanner.nextLine());
		
		switch(choice) {
		case 1:
			
			System.out.println("Enter the product");
			String name=scanner.nextLine();
			products.addProductToList(name);
			break;
		case 2:
			if(products.getProductList().isEmpty()) {
				System.out.println("THe list is empty");
			}
			else {
				products.sortProductList();
				for(String p:products.getProductList()) {
					System.out.println(p);
				}
			}
			break;
		case 3:
			System.out.println("Thank you for using the application");
			break;
			default:
				System.out.println("Invalid choice");
				break;
		}
		}
		while(choice!=3);
			scanner.close();
		

	}

}
