package com.shreya.AssistedProject;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Shreya");    
	      hm.put(2,"Sanju");    
	      hm.put(3,"Kavya");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	    
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Sonu");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Neha");  
	      ht.put(7,"Manu");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());  

}
	}
}
