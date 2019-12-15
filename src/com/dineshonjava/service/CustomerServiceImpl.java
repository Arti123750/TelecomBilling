package com.dineshonjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dineshonjava.dao.CustomerDao;
import com.dineshonjava.model.Customer;

@Service("singleTransactionsService")

//@Service("customerService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)

	
	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		
	}

	@Override
	public List<Customer> listCustomerss() {
		return customerDao.listCustomerss();
		//return null;
	}

	@Override
	public Customer getCustomer(int customer_Id) {
		return customerDao.getCustomer(customer_Id);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);
		
	}
	
	
}
