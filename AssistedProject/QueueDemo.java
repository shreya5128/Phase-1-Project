package com.shreya.AssistedProject;

import java.util.*;
import java.util.LinkedList;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> locationsQueue = new LinkedList<> ();
		locationsQueue.add("Karnataka");
		        		locationsQueue.add("Davangere");
		        		locationsQueue.add("Delhi");
		        		locationsQueue.add("Goa");
		        		locationsQueue.add("Mumbai");
		        		
		System.out.println("Queue is : " + locationsQueue);
		        		System.out.println("Head of Queue : " + locationsQueue.peek());
		        		locationsQueue.remove();
		        		System.out.println("After removing Head of Queue : " + locationsQueue);
		        		System.out.println("Size of Queue : " + locationsQueue.size());

		

	}

}
