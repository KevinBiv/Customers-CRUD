package com.customer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.CustomerDaoImpl;
import com.customer.model.Customer;
import com.springmvc2.dao.ProductDAO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDaoImpl customerDao;

	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public Customer getCustomer(int id) {
		return customerDao.getCustomer(id);
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}

}
