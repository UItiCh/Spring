package com.HG.service;

import com.HG.pojo.Customer;

import java.util.List;


public interface CustomerService {

	public List<Customer> getAllCustomer();
	public int insCustomer(Customer customer);
}
