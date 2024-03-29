package com.telecomebiling.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.telecomebiling.model.Customer;


@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> listCustomerss() {
		return (List<Customer>) sessionFactory.getCurrentSession().createCriteria(Customer.class).list();
	}

	@Override
	public Customer getCustomer(int customer_Id) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, customer_Id);
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Telecome_Billing WHERE customer_Id = "+customer.getCustomer_Id()).executeUpdate();
	}

}
	
	

	
	

