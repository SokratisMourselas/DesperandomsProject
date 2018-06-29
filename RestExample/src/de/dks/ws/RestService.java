package de.dks.ws;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;


@ApplicationPath("/resources")
@Path("/MyRestService")
public class RestService extends Application {
	
	// http:localhost:8081/RestExample/resources/MyRestService/sayHello
	@GET	
	@Path("/sayHello")
	public String getHelloMsg() {
		return "Hello world";
	}
	
	@GET
	@Path("/echo")
	public Response getEchoMsg(@QueryParam("message") String msg) { //the message param is the variable that will be catched from the get method exmpl :http://localhost:8081/RestExample/resources/MyRestService/echo?message=test
		return Response.ok("Your Message was " + msg).build();
	}
	
	@GET
	@Path("/object")
	@Produces(MediaType.APPLICATION_JSON)
	public SimpleObject getObject() {
		return new SimpleObject(2, "Test2");
	}

}
