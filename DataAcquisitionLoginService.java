package com.daas.core.service.login;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;

import com.daas.core.model.login.User;


/**
 * This interface is the service class for Data Acquisition  Login module which consumes the
 * JSON data from the rest call and returns the response in the form of JSON.
 * 
 * @author snatti
 */

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface DataAcquisitionLoginService {
	
	/**
	 * This is the method to be used to validate user login and return
	 * User object 
	 */

	@POST
	@Path("/login/")
	public User login(@RequestBody User user);
	
}
