package com.example.switchyard.switchyard_example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/test")
public interface HelloService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/bla")
	String sayHello(String helloString);

}
