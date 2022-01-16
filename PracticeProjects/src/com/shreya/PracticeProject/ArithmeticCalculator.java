package com.shreya.PracticeProject;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the two numbers: ");
		int firstnumber = scan.nextInt();
		int secnumber = scan.nextInt();
		
		System.out.println("Enter the operator: ");
		char operator = scan.next().charAt(0);
		double result = 0;

		switch(operator){
		case '+': result = firstnumber + secnumber;
		break;
		case '-': result = firstnumber - secnumber;
		break;
		case '*': result = firstnumber * secnumber;
		break;
		case '/': result = firstnumber / secnumber;
		break;
		default:  
		System.out.println("Invalid operator!");
	    break;
		}
		
		System.out.println("The result is " + result);
	}

}
