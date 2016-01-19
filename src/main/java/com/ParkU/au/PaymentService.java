package com.ParkU.au;


import java.net.UnknownHostException;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

	private static final ConnectMongoDB ConnectMongoDB = null;
	@Autowired
	TransactionBo transactionBo;

	@GET
	@Path("/testing")
	public User savePayment() {
	
		String result = transactionBo.save();

		User userName = new User();
		return userName;
		
	//	try {

			/**** Connect to MongoDB ****/
			// Since 2.10.0, uses MongoClient
	//		MongoClient mongo = new MongoClient("localhost", 27017);

			/**** Get database ****/
			// if database doesn't exists, MongoDB will create it for you
	//		DB db = mongo.getDB("mydb");

			/**** Get collection / table from 'testdb' ****/
			// if collection doesn't exists, MongoDB will create it for you
	//		DBCollection table = db.getCollection("employee_collections");

			/**** Insert ****/
			// create a document to store key and value
	//		BasicDBObject document = new BasicDBObject();
	//		document.put("name", "mkyong");
	//		document.put("age", 30);
	//		document.put("createdDate", new Date());
	//		table.insert(document);

			/**** Find and display ****/
	//		BasicDBObject searchQuery = new BasicDBObject();
	//		searchQuery.put("name", "mkyong");

	//		DBCursor cursor = table.find(searchQuery);

	//		while (cursor.hasNext()) {
	//			System.out.println(cursor.next());
	//		}

			/**** Update ****/
			// search document where name="mkyong" and update it with new values
	//		BasicDBObject query = new BasicDBObject();
	//		query.put("name", "mkyong");

	//		BasicDBObject newDocument = new BasicDBObject();
	//		newDocument.put("name", "mkyong-updated");

	//		BasicDBObject updateObj = new BasicDBObject();
	//		updateObj.put("$set", newDocument);

	//		table.update(query, updateObj);

			/**** Find and display ****/
	//		BasicDBObject searchQuery2 
	//		    = new BasicDBObject().append("name", "mkyong-updated");

	//		DBCursor cursor2 = table.find(searchQuery2);

	//		while (cursor2.hasNext()) {
	//			System.out.println(cursor2.next());
	//		}

			/**** Done ****/
	//		System.out.println("Done");

	//	    } catch (MongoException e) {
	//		e.printStackTrace();
	//	    }
	//	return ConnectMongoDB;

	}

}