package com.tfs.mps.emailService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.mps.emailService.service.SendEmailService;

@RestController
public class EmailServiceController {

	@Autowired
	SendEmailService sendEmailService;


	@RequestMapping(value="/sendMail" , method=RequestMethod.GET)
	public String sendMail() throws Exception{


		return  sendEmailService.sendEmail();

	}

}
