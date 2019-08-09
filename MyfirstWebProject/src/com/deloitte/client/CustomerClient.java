package com.deloitte.client;

import com.deloitee.cms.model.Customer;
import com.deloitte.cms.dao.impl.*;
import com.deloitte.dao.CustomerDAO;

public class CustomerClient {

	public static void main(String[] args) {

		int customerId = 1;
		CustomerDAO cutomerDAO = new CustomerDAOimpl();
		//boolean result = cutomerDAO.isCustomerExists(customerId);
		Customer result = cutomerDAO.getCustomerById(customerId);
		
		System.out.println(result);

		 //Customer customer = new Customer(19, "Ishitha", "Chennai", 2000);
		 //boolean reultInsert = cutomerDAO.insertCustomer(customer);
		// System.out.println(reultInsert);
		
		
		
	}

}
