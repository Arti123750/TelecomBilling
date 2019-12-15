package com.telecomebiling.service;

import java.util.List;

import com.telecomebiling.model.Customer;


public interface CustomerService {
	
	public void addCustomer(Customer customer);

	public List<Customer> listCustomerss();
	
	public Customer getCustomer(int customer_Id);
	
	public void deleteCustomer(Customer customer);
}
