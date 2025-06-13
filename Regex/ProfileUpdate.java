package com.Bharani.Regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfileUpdate {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		String name=null,pan=null,email=null;
		Pattern pattern=null;
		Matcher matcher=null;
		System.out.println("Enter your name");
		name=scanner.nextLine();
		System.out.println("Enter your PAN number");
		pan =scanner.nextLine();
		pattern=pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		matcher=pattern.matcher(pan);
		if(!matcher.matches()) {
			System.out.printf("%s is an invalid PAN number",pan);
			return;
		}
		System.out.println("Enter your E-mail ID");
		email=scanner.nextLine();
		pattern=pattern.compile("^[a-z]{5,10}@digits.com");
		matcher=pattern.matcher(email);
		if(!matcher.matches()) {
			System.out.println("Invalid E-mail");
			return;
		}
		System.out.printf("Profile of %s updated successfully",name);
	}

}
