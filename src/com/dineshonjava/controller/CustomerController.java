package com.dineshonjava.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dineshonjava.bean.CustomerBean;
import com.dineshonjava.model.Customer;
import com.dineshonjava.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView savecustomer(@ModelAttribute("command") CustomerBean customerBean, BindingResult result) {
		Customer customer = prepareModel(customerBean);
		customerService.addCustomer(customer);
		return new ModelAndView("redirect:/add.html");

	}

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ModelAndView listcustomers() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customers", prepareListofBean(customerService.listCustomerss()));
		return new ModelAndView("customersList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addcustomer(@ModelAttribute("command") CustomerBean customerBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customers", prepareListofBean(customerService.listCustomerss()));
		return new ModelAndView("addCustomer", model);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	@RequestMapping(value = "/telecomeServices", method = RequestMethod.GET)
	public ModelAndView services() {
		return new ModelAndView("telecomeServices");
	}

	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editcustomer(@ModelAttribute("command") CustomerBean customerBean, BindingResult result) {
		customerService.deleteCustomer(prepareModel(customerBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customer", null);
		model.put("customers", prepareListofBean(customerService.listCustomerss()));
		return new ModelAndView("addCustomer", model);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deletecustomer(@ModelAttribute("command") CustomerBean customerBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customer", preparecustomerBean(customerService.getCustomer(customerBean.getCustomer_Id())));
		model.put("customers", prepareListofBean(customerService.listCustomerss()));
		return new ModelAndView("addCustomer", model);
	}

	private Object preparecustomerBean(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	private Customer prepareModel(CustomerBean customerBean) {

		Customer customer = new Customer();
		customer.setCustomer_Name(customerBean.getCustomer_Name());
		customer.setCustomer_Address(customerBean.getCustomer_Address());
		customer.setCustomer_Age(customerBean.getCustomer_Age());
		customer.setCustomer_MobileNo(customerBean.getCustomer_MobileNo());
		customer.setCustomer_Credit(customerBean.getCustomer_Credit());
		customerBean.setCustomer_Id(null);
		return customer;
	}

	private List<CustomerBean> prepareListofBean(List<Customer> customers) {
		List<CustomerBean> beans = null;
		if (customers != null && !customers.isEmpty()) {
			beans = new ArrayList<CustomerBean>();
			CustomerBean bean = null;
			for (Customer customer : customers) {
				bean = new CustomerBean();

				bean.setCustomer_Name(customer.getCustomer_Name());
				bean.setCustomer_Address(customer.getCustomer_Address());
				bean.setCustomer_Age(customer.getCustomer_Age());
				bean.setCustomer_MobileNo(customer.getCustomer_MobileNo());
				bean.setCustomer_Credit(customer.getCustomer_Credit());
				beans.add(bean);

			}
		}
		return beans;
	}
}
