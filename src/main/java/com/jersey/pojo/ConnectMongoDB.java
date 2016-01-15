package com.jersey.pojo;

import java.net.UnknownHostException;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class ConnectMongoDB {

	public void ConnectDatabase()  {
		try {
			MongoClient mongo = new MongoClient("localhost", 12707);
			DB db = mongo.getDB("mydb");
			DBCollection table = db.getCollection("employee_collections");
			
			
			/**** Insert ****/
			// create a document to store key and value
			BasicDBObject document = new BasicDBObject();
			document.put("name", "janet");
			document.put("age", 30);
			document.put("createdDate", new Date());
			table.insert(document);

			}
			catch (Exception e) {
			System.err
					.println(e.getClass().getName() + "e : " + e.getMessage());
		}
	}
}

