package com.orm.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class MainSaveVehicle{
 

	 // This method is used to create the hibernate's sessionFactory Object
	private static SessionFactory buildSessionFactory(){
// create configuration instance and passing hibernate configeration file
		Configuration configObj = new Configuration ();
		configObj.configure("hibernate.xml");
		ServiceRegistry serviceregisteryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();
		// create hibernate sessionFactory instance
	SessionFactory sessionFactoryObj = configObj.buildSessionFactory(serviceregisteryObj);
	return sessionFactoryObj;
		
}
	public static void main(String[] args) {
	Session	 sessionObj=buildSessionFactory().getCurrentSession();
	//Getting Transaction object from Session object 
	sessionObj.beginTransaction();
  
	// create object of book
	  Vehicle vk = new  Vehicle();
		
		vk.setBrand("BMW");
		vk.setColor("Blue");

	
	sessionObj.save(vk);// saving the object 
	sessionObj.getTransaction().commit();
	}	
	
}
	

	
		
		

