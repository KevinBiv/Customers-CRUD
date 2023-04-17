package com.customer.dao;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerDao {
	List<Customer> getCustomers();
	Customer getCustomer(int id);
	void saveCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
}