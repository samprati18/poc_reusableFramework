package com.tcs.springboot.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface Source {
	
	@Output("addCustomerDetails")
	MessageChannel addCustomerDetailsOutput();
	

	@Output("updateCustomerDetails")
	MessageChannel updateCustomerDetailsOutput();

	

}
