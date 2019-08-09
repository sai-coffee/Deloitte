package com.deloitee.cms.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/* 
import com.delloite.cms.model.Customer;
import com.delloite.cms.model.PremiumCustomer;*/
 
public class Client {
   
    public static void main(String[] args) {
       
        Configuration configuration  = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
       
   
    Set allAddress = new HashSet();
    EmployeeDetails emp1 = new EmployeeDetails(1, "Arun", 95000);
    EmployeeDetails emp3 = new EmployeeDetails(3, "Sarun", 295000);
    EmployeeDetails emp2 = new EmployeeDetails(2, "Varun", 195000);
    
    Address add1= new Address(1, "hyd", "telengana");
    Address add2= new Address(2, "chn", "TN");
    
    allAddress.add(add1);
    allAddress.add(add2);
    
    emp1.setEmployeeAddress(allAddress);
    emp2.setEmployeeAddress(allAddress);
    
    session.save(emp1);
    session.save(emp2);
    session.save(emp3);
    
    
        transaction.commit();  
        session.close();
    }
 
 
}
 