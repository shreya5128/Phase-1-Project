package com.shreya.Method.AssistedProject;

public class CallMethod {
	int val = 250;

	int operation(int val) {
		val = val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		CallMethod d = new CallMethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}

}


