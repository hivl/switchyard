package com.example.switchyard.SellingSystem;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

@Service(MailService.class)
public class MailServiceBean implements MailService {
	
	private static final Logger LOGGER = Logger.getLogger(MailServiceBean.class);

	@Override
	public void warnArticleCountIsLow(SellInformation sellInformation) {
		// Recipient's email ID needs to be mentioned.
	      String to = "einkauf@127.0.0.1";

	      // Sender's email ID needs to be mentioned
	      String from = "seller@127.0.0.1";

	      // Assuming you are sending email from localhost
	      String host = "127.0.0.1";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("127.0.0.1", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("Count for product: " + sellInformation.getName() + " is under 100!");

	         // Now set the actual message
	         message.setText("The product count for product " + sellInformation.getName() + " with the id: " + sellInformation.getId() + " is " + sellInformation.getCount() + "!"
	        		 + "\n\nOrder some more! \n\nGreets your selling system");

	         // Send message
	         Transport.send(message);
	         LOGGER.info("Mail was sent");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
		
		
		
		
	}

}
