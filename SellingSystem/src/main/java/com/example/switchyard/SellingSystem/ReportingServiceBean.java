package com.example.switchyard.SellingSystem;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

@Service(ReportingService.class)
public class ReportingServiceBean implements ReportingService {
	
	private static final Logger LOGGER = Logger.getLogger(ReportingServiceBean.class);

	@Override
	public void storeSellInformation(SellInformation sellInformation) {
		LOGGER.info("The sell information: " + sellInformation + " was stored");
	}

}
