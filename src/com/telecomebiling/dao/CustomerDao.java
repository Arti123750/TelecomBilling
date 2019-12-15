package com.telecomebiling.dao;

import java.util.List;

import com.telecomebiling.model.Customer;



public interface CustomerDao {
	
	public void addCustomer(Customer customer);

	public List<Customer> listCustomerss();
	
	public Customer getCustomer(int customer_Id);
	
	public void deleteCustomer(Customer customer);
}
