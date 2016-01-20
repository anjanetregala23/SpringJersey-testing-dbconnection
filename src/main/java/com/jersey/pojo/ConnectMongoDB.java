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
			System.out.println("Connect successfully");
			DBCollection table = db.getCollection("employee_collections");
			
			}
			catch (Exception e) {
			System.err
					.println(e.getClass().getName() + "e : " + e.getMessage());
		}
	}
}

