package com.tcs.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tcs.springboot.model.Customer;
import com.tcs.springboot.service.CustomerService;

@RestController

public class CustomerController {


	@Autowired
	CustomerService customerService;




	@RequestMapping(value="/saveCustomerDetails" , method = RequestMethod.POST)
	public String saveCustomerDetails(@RequestBody Customer customer){

		return customerService.saveCustomerDetails(customer);
	}


	@RequestMapping(value="/updateCustomerDetails" , method = RequestMethod.POST)
	public String updateCustomerDetails(@RequestBody Customer customer){

		return customerService.updateCustomerDetails(customer);
	}


	/*@RequestMapping(value="/findAllCustomers" , method = RequestMethod.GET)
	public List<Customer> findAllCustomers(){

		return customerService.findAllCustomers();
	}*/


	/*@RequestMapping(value="/deleteCustomerById" , method = RequestMethod.DELETE)
	public String deleteCustomerById( @RequestParam int customerId){
		return customerService.deleteCustomerById(customerId);
	}*/


}
