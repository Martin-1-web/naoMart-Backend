package com.martin.service;

import java.util.Properties;

import org.springframework.stereotype.Service;

import com.martin.model.User;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImplementation implements EmailService {
	
	private User user = new User();
	
	final String from = "martindzeble@gmail.com";
	final String password = "qidwccwhgvfswdyi";
	
	@Override
	public void sendMail(String to) {
		
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", 587);
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		
		Session session = Session.getInstance(properties, new Authenticator() {
			protected jakarta.mail.PasswordAuthentication getPasswordAuthentication() {
				return new jakarta.mail.PasswordAuthentication(user.getEmail(), password);
			}
		});
		
		try {
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(to));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("Hello, From naoMart");
			message.setText("This a test mail sent from naoMart Institute Of Technology");
			
			Transport.send(message);
			System.out.println("Mail sent Successfully");
			
		} catch (MessagingException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(to);
	}
}
