package com.shreya.Constructor.AssistedPriject;

public class Std {
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}



public static void main(String[] args) {

	Std std1 = new Std(12,"Shreya");
	Std std2 = new Std(7,"Kavya");
	std1.display();
	std2.display();
		}
}


