package com.tfs.mps.emailService.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {


	@Autowired
	JavaMailSender sender;


	public String sendEmail()  throws Exception{
		MimeMessage message = sender.createMimeMessage();

		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo("sampratiji@gmail.com");
		helper.setText("How are you?");
		helper.setSubject("Hi");
		sender.send(message);
		return "Email Sent!";

	}
}
