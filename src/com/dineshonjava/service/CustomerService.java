package com.dineshonjava.service;

import java.util.List;

import com.dineshonjava.model.Customer;


public interface CustomerService {
	
	public void addCustomer(Customer customer);

	public List<Customer> listCustomerss();
	
	public Customer getCustomer(int customer_Id);
	
	public void deleteCustomer(Customer customer);
}
