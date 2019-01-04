package com.tcs.springboot.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.tcs.springboot.config.Source;
import com.tcs.springboot.model.Customer;

@Service
@EnableBinding(Source.class)
public class CustomerService {




	@Autowired
	public Source source;


	public String saveCustomerDetails(Customer customer){

		saveCustomerDetailsInKafka(customer);
		return "send customer data to kafka";

	}

	public String updateCustomerDetails(Customer customer){

		updateCustomerDetailsInKafka(customer);
		return "send  updated customer data to kafka";

	}




	public void saveCustomerDetailsInKafka(Customer customer){
		
		source.addCustomerDetailsOutput().send(MessageBuilder.withPayload(customer).build());



	}

	public void updateCustomerDetailsInKafka(Customer customer){
		
		source.updateCustomerDetailsOutput().send(MessageBuilder.withPayload(customer).build());



	}



}
