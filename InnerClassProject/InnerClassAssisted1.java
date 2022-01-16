package com.shreya.InnerClassProject;

public class InnerClassAssisted1 {
 private String msg="Hello Shreya"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", How are you doing");}  
	 }  


	public static void main(String[] args) {

		InnerClassAssisted1 obj=new InnerClassAssisted1();
		InnerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


