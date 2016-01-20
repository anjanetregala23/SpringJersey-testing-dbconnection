package com.ParkU.au;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jersey.pojo.User;
import com.springjersey.transaction.TransactionBo;

@Component
@Path("/payment")
public class PaymentService {

	@Autowired
	TransactionBo transactionBo;

	@GET
	@Path("/testing")
	@Produces(MediaType.APPLICATION_JSON)
	public User savePayment() {

		// String result = transactionBo.save();
		// return Response.status(200).entity(result).build();
		User user = new User();
		user.setUserName("anjanetregala23");
		return user;
	}
	
	@POST
	@Path("/post")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUserInJSON(User user){
		String result = "USER saved"+user;
		return Response.status(200).entity(result).build();
	}
	

	/*public ConnectMongoDB connectDB() {

		ConnectMongoDB conndb = new ConnectMongoDB();
		return conndb;
	}*/

}