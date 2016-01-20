package com.ParkU.au;


import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.ParkU.classs.Employee;
import com.jersey.pojo.ConnectMongoDB;
import com.jersey.pojo.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.springjersey.transaction.TransactionBo;

@Component
@Path("/payment")
@Produces(MediaType.APPLICATION_JSON)
public class PaymentService {

	@Autowired
	TransactionBo transactionBo;

    @GET
	@Path("/testing")
	public Response savePayment() {
	
		 String result = transactionBo.save();
		 return Response.status(200).entity(result).build();
		//User userName = new User();
		//return userName;
	}	
    
    public ConnectMongoDB connectDB(){
    	
    	ConnectMongoDB conndb = new ConnectMongoDB();
    	return conndb;
    }
	
	
	

}