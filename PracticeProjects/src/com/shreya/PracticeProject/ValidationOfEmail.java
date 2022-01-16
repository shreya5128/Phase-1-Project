package com.shreya.PracticeProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfEmail {
	
	public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();
	}

	public static void main(String[] args) {
		List<String> emails = new ArrayList<String>();
	       //valid email addresses
	       emails.add("shreya@gmail.com");
	       emails.add("sanju12@gmail.com");
	       emails.add("kavya7@gmail.com");
	      
	       //invalid email addresses
	       emails.add("@yahoo.com");
	       emails.add("shivani#bg.com");
	       emails.add("neha%.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check: ");
	       Scanner scan = new Scanner(System.in);
	       String input = scan.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
		
	}

}
