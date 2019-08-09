package com.delloite.cms.dao.impl;

import java.lang.annotation.Annotation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.model.Customer;
import com.delloite.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String GET_ALL_CUSTOMER_QUERY = "select * from hr.customer";

	Configuration configuration =  new Configuratio().configure();
	SessionFactory factory = configuration.buildSessionFactory();
	Session session ;
	
	
	@Override
	public List<Customer> getAllCustomers() {
		
	List<Customer>allCustomers = new ArrayList<Customer>();
/*	session=factory.openSession();
	Query query=session.createQuery("from com.delloite.cms.model.Customer");
	Iterator<Customer> iterator= query.iterate();
	while(iterator.hasNext())
	{
		
		Customer customer =iterator.next();
		allCustomers.add(customer);
	}
	
	return allCustomers;*/
	
	/*session=factory.openSession();
	return session.createQuery("from com.delloite.cms.model.Customer").list();
	*/
	Criteria criteria = session.createCriteria(Customer.class);
	criteria.add(Restrictions.like("customerAddress", "Pune"));
	return criteria.list();
	
	
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();
			session.close();
			return true;
			
	}


	@Override
	public boolean updateCustomer(Customer customer) {
		/*Connection connection = DbUtility.getMyConnection();
		int noOfRecords = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
			statement.setInt(4, customer.getCustomerId());
			statement.setString(1, customer.getCustomerName());
			statement.setString(2, customer.getCustomerAddress());
			statement.setInt(3, customer.getBillAmount());
			noOfRecords = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (noOfRecords == 0)
			return false;
		else
			return true;
	}*/
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		session.close();
		return true;
		
	}
	

	@Override
	public boolean deleteCustomer(int customerId) {
		
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		return true;		

	}

	@Override
	public Customer searchCustomerById(int customerId) {
		session = factory.openSession();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		session.close();
		return customer;
		
	}
	@Override
	public boolean isCustomerExists(int customerId) {
		session = factory.openSession();
		Customer customer =  (Customer) session.get(Customer.class, customerId);
		session.close();
		if(customer ==null) {
			return false;
		}
		else
		{
			return true;
		}
			
	}

}
