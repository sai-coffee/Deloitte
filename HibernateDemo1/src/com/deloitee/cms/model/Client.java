package com.deloitee.cms.model;

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
       
       /* PremiumCustomer customer = new PremiumCustomer(1, "Bob", "Delhi", 4500);
        customer.setRewardPoints(52);*/
       
        Customer cust = new Customer(1, "Jim", "USA", 2200);
   
       
        //PremiumCustomer customer = new PremiumCustomer(1, "Bob", "Delhi", 4500);
        //customer.setRewardPoints(52);
       
 
        System.out.println(cust);
       // System.out.println(customer);
        session.save(cust);
        transaction.commit();  
    }
 
 
}
 