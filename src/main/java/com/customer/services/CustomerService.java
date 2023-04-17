package com.customer.services;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void saveCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
}
