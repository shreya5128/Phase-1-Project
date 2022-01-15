package com.shreyaks.project;

import java.util.Scanner;

import java.io.FileNotFoundException;

public class MenuOptions {

	public static void main(String[] args) {
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
	}

	
	
	private static void welcomeScreen() {
		System.out.println("         Welcome to Lockedme.com         \n");
		
		System.out.println("       by Company Lockers Pvt Ltd        \n");
		
		System.out.println(" This application was developed by Shreya K S  \n");
	}

	
	private static void menuDriven() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		FileOperations obj = new FileOperations();
		int option;
		do {
		System.out.println("Select any option number from below and press Enter: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Business-level operation menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=scan.nextInt();
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Select any option number for Business level operation from below and press Enter: \n");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file from a directory");
			System.out.println("\t3. Searching a file and showing its content");
			System.out.println("\t4. Exit from BLO menu");
			
			ch=scan.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exited from the Business Level operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");
		}

		
		}while(option!=3);

	}

	}


