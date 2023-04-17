package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customer.model.Customer;
import com.customer.services.CustomerServiceImpl;

@Controller
public class MainController {
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	@RequestMapping("/")
	public String customersList(Model model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "index";
	}
	
	@RequestMapping("/add")
	public String registerForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "add";
	}
	
	@RequestMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/";
	}
	
	@RequestMapping("/update")
	public String updateForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "update";
	}
	
	@RequestMapping("/updateCustomer")
	public String updateCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.updateCustomer(customer);
		return "redirect:/";
	}
	
	@RequestMapping("/delete")
	public String deleteForm(@RequestParam("id") int id ,Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "delete";
	}
	
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.deleteCustomer(customer.getId());
		return "redirect:/";
	}
	
}
