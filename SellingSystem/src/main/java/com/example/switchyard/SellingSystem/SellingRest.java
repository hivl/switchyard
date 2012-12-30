package com.example.switchyard.SellingSystem;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/sells")
public interface SellingRest {
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/sellinformation")
	void postSellInformation(SellInformation sellInformation);

}
