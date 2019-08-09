package com.deloitte.dao;
import java.util.List;

import com.deloitee.cms.model.Customer;
public interface CustomerDAO {
	
	public List<Customer> getAllCustomers();
	public boolean insertCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	public boolean isCustomerExists(int customerId);
	
	
}
