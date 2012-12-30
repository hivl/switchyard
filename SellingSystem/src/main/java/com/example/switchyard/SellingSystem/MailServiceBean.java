package com.example.switchyard.SellingSystem;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

@Service(MailService.class)
public class MailServiceBean implements MailService {
	
	private static final Logger LOGGER = Logger.getLogger(MailServiceBean.class);

	@Override
	public void warnArticleCountIsLow(SellInformation sellInformation) {
		LOGGER.info("Mail was sent");
		
	}

}
