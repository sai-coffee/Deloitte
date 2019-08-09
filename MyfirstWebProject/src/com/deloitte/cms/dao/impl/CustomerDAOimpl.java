package com.deloitte.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitee.cms.model.Customer;
import com.deloitte.dao.CustomerDAO;
import com.deloitte.utility.DBUtility;

public class CustomerDAOimpl implements CustomerDAO {
private static final String GET_ALL_CUSTOMER_QUERY = "select * from hr.customer";

	@Override
	public List<Customer> getAllCustomers() {
		
		Connection connection = DBUtility.getMyConnection();
		
		
		List<Customer> allCustomers = new ArrayList<Customer>();

		try {
			PreparedStatement statement = connection.prepareStatement(GET_ALL_CUSTOMER_QUERY);

			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString(2));
				customer.setCustomerAddress(resultSet.getString(3));
				customer.setBillAmount(resultSet.getInt(4));
				allCustomers.add(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allCustomers;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		Connection connection = DBUtility.getMyConnection();
		int noOfRecords = 0;

		try {

			PreparedStatement statement = connection.prepareStatement("insert into hr.customer values(?,?,?,?)");
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setString(3, customer.getCustomerAddress());
			statement.setInt(4, customer.getBillAmount());
			noOfRecords = statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (noOfRecords == 0)
			return false;
		else
			return true;

	}

	private static final String UPDATE_CUSTOMER_QUERY = "update hr.customers set customerAddress = ?, customerName =?, billAmount = ? where customerId = ?";

	@Override
	public boolean updateCustomer(Customer customer) {
		int noOfRecords = 0;

		try {
			PreparedStatement statement = DBUtility.getMyConnection().prepareStatement(UPDATE_CUSTOMER_QUERY);
			statement.setInt(4, customer.getCustomerId());
			statement.setString(1, customer.getCustomerAddress());
			statement.setString(2, customer.getCustomerName());
			statement.setInt(3, customer.getBillAmount());
			noOfRecords = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (noOfRecords == 0)
			return false;
		else
			return true;

	}

	static final String SELECT_DELETE_QUERY = "DELETE * from hr.customer where customerId=?";

	@Override
	public boolean deleteCustomer(Customer customer) {
		Connection connection = DBUtility.getMyConnection();
		
		PreparedStatement statement = null;

		ResultSet resultSet;
		try {
			statement = connection.prepareStatement(SELECT_DELETE_QUERY);
			statement.setInt(1, customer.getCustomerId());
			resultSet = statement.executeQuery();
			resultSet.next();
			if (resultSet.next()) 
			{
				return true;

			} else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Customer getCustomerById(int customerId) {

		Connection connection = DBUtility.getMyConnection();

		ResultSet resultSet;
		Customer customer = new Customer();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			resultSet = statement.executeQuery();
			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	private static final String SELECT_CUSTOMER_QUERY = "select * from hr.customer where customerId=?";

	@Override
	public boolean isCustomerExists(int customerId) {

		Connection connection = DBUtility.getMyConnection();
		boolean isUserExisats = false;
		ResultSet resultSet;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				return isUserExisats = true;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isUserExisats;

	}
}
