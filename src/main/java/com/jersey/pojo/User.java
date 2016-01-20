package com.jersey.pojo;

import com.sun.xml.bind.annotation.OverrideAnnotationOf;

public class User {
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString(){
		return "User [username="+userName+"]";
	}
	
	
	
}
