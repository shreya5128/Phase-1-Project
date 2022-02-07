package com.emp.training;

import java.util.List;

import javax.security.auth.login.Configuration;
import javax.websocket.Session;

import com.emp.training.SessionFactory;

public class App {
	public static void main( String[] args )
	 {
	// Get the SessionFactory
	 SessionFactory factory = new Configuration()
	 .configure("hibernate.cfg.xml")
	 
	.addAnnotatedClass(Students.class)
	 .buildSessionFactory();
	 
	// Get the Session
	 Session theSession = factory.getCurrentSession();
	 
	 try {
	// Add a new learner
	 Students theLearner = new Students("sanju",112,"java",1001);
	 
	 
	// Start the transaction
	 theSession.beginTransaction();
	 
	// Save the learner
	 theSession.save(theLearner);
	 
	// Commit the transaction
	 theSession.getTransaction().commit();
	 System.out.println("new students sucessfully inserted ");
	 System.out.println("Learner id : " + theLearner.name);
	 
	// Learner learner = theSession.get(Learner.class, 2);
	// 
	// System.out.println("Learner details by id : " + learner);
	 
	 
	 
	 
	 }finally {
	 factory.clone();

}
	 }
	
}