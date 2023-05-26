package com.HG.controller;


import com.HG.pojo.Customer;
import com.HG.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("customerList")
	public String getCustomerList(Model model) {

		List<Customer> list = customerService.getAllCustomer();
		
		System.out.println(list.size());
		
		model.addAttribute("list", list);
		
		return "customerList";
	}
}
