package come.Bharani.collection.task2;

import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  ClassHouseFormation chf=new ClassHouseFormation();
	  System.out.println("Enter the number of students");
	  int count=Integer.parseInt(scanner.nextLine());
	  if(count<=0) {
		System.out.println("Invalid input");
		return;
	  }
		  System.out.println("Enter the details");
		  for(int i=0;i<count;i++) {
			  String input = scanner.nextLine();
			  chf.addName(input);
			  
		  }
		  HashSet<String> teams=chf.formTeam();
		  for(String student: teams){
			  System.out.println(student);
		  }
	
	}

}
