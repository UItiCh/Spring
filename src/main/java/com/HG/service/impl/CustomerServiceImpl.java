package com.HG.service.impl;

import java.util.List;

import com.HG.dao.CustomerDao;
import com.HG.pojo.Customer;
import com.HG.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired  
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> getAllCustomer() {
		//����CustomerDao�ķ���
		return customerDao.getAllCustomer();
	}

}
